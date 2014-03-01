# Typed Clojure Practice

## Preparation

Add `[lein-typed "0.3.1"]` to `{:user {:plugins [ __here__ ] }}` in `$HOME/.lein/profiles.clj`.

Run `lein new app a-name-as-you-like`.

Add `[org.clojure/core.typed "0.2.34"]` to `(defproject ... :dependencies [ __here__ ] ...)` in `a-name-as-you-like/project.clj`

## Usage

```sh
lein typed check
```

## References

* [clojure/core.typed](https://github.com/clojure/core.typed)
* [typedclojure/lein-typed](https://github.com/typedclojure/lein-typed)

## License

[MIT](http://opensource.org/licenses/MIT)

Copyright 2014 ka
