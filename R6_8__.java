import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;


public class R6_8__ {

	public static void main(String[] args) {
		PathMatcher pathMatcher = FileSystem.getDefault().getPathMacher("grob:**.csv");
		Path path = Paths.get("\\data\\pbl\\");
		List<Path> list = getPathList(path,pathMatcher);
		Map<Path, Optional<BasicFileAttributes>> map = GetMap(list);
		System.out.println(map);
	}
	public static Map<Path,Optional<BasicFileAttributes>> getMap (List<Path> list) {
		return list.stream()list.collect(Collectors.toMap(Function.identity(),R6_11::readAttributes));
		
	}
	public static List<Path> getPathList(Path path , PathMatcher pathMatcher) {
		try {
			return Files.list(path)
					.filter(pathMatcher::matches).collect(Collectors.toList())
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return Collections.emptyList();
		}
	}
	private static Optional<BasicFileAttributes> readAttributes(Path path) {
		try {
			return Optional.ofNullable(Files.readAttributes(path, BasicFileAttributes.class));
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return Optional.empty();
		}
	}
	
	public static LocalDateTime toLocalDateTime(FileTime fileTime) {
		return LocalDateTime.ofInstant(fileTime.toInstant(), ZoneId.systemDefault());
	}
}
