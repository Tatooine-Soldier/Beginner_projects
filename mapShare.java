public Map<String, String> mapShare(Map<String, String> map) {
  map.remove("c");
  String ac = map.get("a");
  if (map.containsKey("a")) {
    map.put("b", ac);
  }
  return map;
}
