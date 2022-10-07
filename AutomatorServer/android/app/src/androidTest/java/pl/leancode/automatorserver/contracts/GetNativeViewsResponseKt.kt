//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: contracts.proto

package pl.leancode.automatorserver.contracts;

@kotlin.jvm.JvmName("-initializegetNativeViewsResponse")
inline fun getNativeViewsResponse(block: pl.leancode.automatorserver.contracts.GetNativeViewsResponseKt.Dsl.() -> kotlin.Unit): pl.leancode.automatorserver.contracts.Contracts.GetNativeViewsResponse =
  pl.leancode.automatorserver.contracts.GetNativeViewsResponseKt.Dsl._create(pl.leancode.automatorserver.contracts.Contracts.GetNativeViewsResponse.newBuilder()).apply { block() }._build()
object GetNativeViewsResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: pl.leancode.automatorserver.contracts.Contracts.GetNativeViewsResponse.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: pl.leancode.automatorserver.contracts.Contracts.GetNativeViewsResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): pl.leancode.automatorserver.contracts.Contracts.GetNativeViewsResponse = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    class NativeViewsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .patrol.NativeView nativeViews = 2;</code>
     */
     val nativeViews: com.google.protobuf.kotlin.DslList<pl.leancode.automatorserver.contracts.Contracts.NativeView, NativeViewsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getNativeViewsList()
      )
    /**
     * <code>repeated .patrol.NativeView nativeViews = 2;</code>
     * @param value The nativeViews to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addNativeViews")
    fun com.google.protobuf.kotlin.DslList<pl.leancode.automatorserver.contracts.Contracts.NativeView, NativeViewsProxy>.add(value: pl.leancode.automatorserver.contracts.Contracts.NativeView) {
      _builder.addNativeViews(value)
    }
    /**
     * <code>repeated .patrol.NativeView nativeViews = 2;</code>
     * @param value The nativeViews to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignNativeViews")
    @Suppress("NOTHING_TO_INLINE")
    inline operator fun com.google.protobuf.kotlin.DslList<pl.leancode.automatorserver.contracts.Contracts.NativeView, NativeViewsProxy>.plusAssign(value: pl.leancode.automatorserver.contracts.Contracts.NativeView) {
      add(value)
    }
    /**
     * <code>repeated .patrol.NativeView nativeViews = 2;</code>
     * @param values The nativeViews to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllNativeViews")
    fun com.google.protobuf.kotlin.DslList<pl.leancode.automatorserver.contracts.Contracts.NativeView, NativeViewsProxy>.addAll(values: kotlin.collections.Iterable<pl.leancode.automatorserver.contracts.Contracts.NativeView>) {
      _builder.addAllNativeViews(values)
    }
    /**
     * <code>repeated .patrol.NativeView nativeViews = 2;</code>
     * @param values The nativeViews to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllNativeViews")
    @Suppress("NOTHING_TO_INLINE")
    inline operator fun com.google.protobuf.kotlin.DslList<pl.leancode.automatorserver.contracts.Contracts.NativeView, NativeViewsProxy>.plusAssign(values: kotlin.collections.Iterable<pl.leancode.automatorserver.contracts.Contracts.NativeView>) {
      addAll(values)
    }
    /**
     * <code>repeated .patrol.NativeView nativeViews = 2;</code>
     * @param index The index to set the value at.
     * @param value The nativeViews to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setNativeViews")
    operator fun com.google.protobuf.kotlin.DslList<pl.leancode.automatorserver.contracts.Contracts.NativeView, NativeViewsProxy>.set(index: kotlin.Int, value: pl.leancode.automatorserver.contracts.Contracts.NativeView) {
      _builder.setNativeViews(index, value)
    }
    /**
     * <code>repeated .patrol.NativeView nativeViews = 2;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearNativeViews")
    fun com.google.protobuf.kotlin.DslList<pl.leancode.automatorserver.contracts.Contracts.NativeView, NativeViewsProxy>.clear() {
      _builder.clearNativeViews()
    }

  }
}
@kotlin.jvm.JvmSynthetic
inline fun pl.leancode.automatorserver.contracts.Contracts.GetNativeViewsResponse.copy(block: pl.leancode.automatorserver.contracts.GetNativeViewsResponseKt.Dsl.() -> kotlin.Unit): pl.leancode.automatorserver.contracts.Contracts.GetNativeViewsResponse =
  pl.leancode.automatorserver.contracts.GetNativeViewsResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

