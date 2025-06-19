package fluent.ui.system.icons.colored

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Colored.BuildingStore: ImageVector
    get() {
        if (_BuildingStore != null) {
            return _BuildingStore!!
        }
        _BuildingStore = ImageVector.Builder(
            name = "Colored.BuildingStore",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0.312f to Color(0xFF29C3FF),
                        1f to Color(0xFF0094F0)
                    ),
                    start = Offset(7.5f, 10.182f),
                    end = Offset(9.684f, 22.659f)
                )
            ) {
                moveTo(3f, 9.75f)
                curveTo(3f, 9.336f, 3.336f, 9f, 3.75f, 9f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 9f, 21f, 9.336f, 21f, 9.75f)
                verticalLineTo(21.25f)
                curveTo(21f, 21.664f, 20.664f, 22f, 20.25f, 22f)
                horizontalLineTo(3.75f)
                curveTo(3.336f, 22f, 3f, 21.664f, 3f, 21.25f)
                verticalLineTo(9.75f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF0067BF),
                        1f to Color(0xFF003580)
                    ),
                    start = Offset(6.214f, 14.688f),
                    end = Offset(12.033f, 18.718f)
                ),
                fillAlpha = 0.8f,
            ) {
                moveTo(6f, 13.75f)
                curveTo(6f, 13.336f, 6.336f, 13f, 6.75f, 13f)
                horizontalLineTo(11.25f)
                curveTo(11.664f, 13f, 12f, 13.336f, 12f, 13.75f)
                verticalLineTo(22f)
                horizontalLineTo(6f)
                verticalLineTo(13.75f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFDFDFD),
                        1f to Color(0xFFB3E0FF)
                    ),
                    start = Offset(14.5f, 12.444f),
                    end = Offset(16.327f, 19.02f)
                ),
                fillAlpha = 0.8f,
            ) {
                moveTo(13f, 13.75f)
                curveTo(13f, 13.336f, 13.336f, 13f, 13.75f, 13f)
                horizontalLineTo(17.25f)
                curveTo(17.664f, 13f, 18f, 13.336f, 18f, 13.75f)
                verticalLineTo(17.25f)
                curveTo(18f, 17.664f, 17.664f, 18f, 17.25f, 18f)
                horizontalLineTo(13.75f)
                curveTo(13.336f, 18f, 13f, 17.664f, 13f, 17.25f)
                verticalLineTo(13.75f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFB6F7B),
                        1f to Color(0xFFD7257D)
                    ),
                    start = Offset(17.154f, 2f),
                    end = Offset(17.154f, 6.375f)
                )
            ) {
                moveTo(14f, 6f)
                lineTo(13f, 2f)
                horizontalLineTo(17.909f)
                curveTo(18.19f, 2f, 18.458f, 2.118f, 18.647f, 2.326f)
                lineTo(21.739f, 5.714f)
                curveTo(21.907f, 5.898f, 22f, 6.138f, 22f, 6.388f)
                verticalLineTo(8f)
                curveTo(22f, 10.209f, 20.209f, 12f, 18f, 12f)
                curveTo(15.791f, 12f, 14f, 10.209f, 14f, 8f)
                verticalLineTo(6f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFB6F7B),
                        1f to Color(0xFFD7257D)
                    ),
                    start = Offset(6.154f, 2f),
                    end = Offset(6.154f, 6.375f)
                )
            ) {
                moveTo(2f, 6.388f)
                curveTo(2f, 6.138f, 2.093f, 5.898f, 2.261f, 5.714f)
                lineTo(5.353f, 2.326f)
                curveTo(5.542f, 2.118f, 5.81f, 2f, 6.091f, 2f)
                horizontalLineTo(11f)
                lineTo(10f, 6f)
                verticalLineTo(8f)
                curveTo(10f, 10.209f, 8.209f, 12f, 6f, 12f)
                curveTo(3.791f, 12f, 2f, 10.209f, 2f, 8f)
                verticalLineTo(6.388f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0.304f to Color(0xFFFF9FB2),
                        1f to Color(0xFFF97DBD)
                    ),
                    start = Offset(12f, 2f),
                    end = Offset(12f, 6.375f)
                )
            ) {
                moveTo(8f, 6.176f)
                curveTo(8f, 6.06f, 8.021f, 5.944f, 8.062f, 5.835f)
                lineTo(9.5f, 2f)
                horizontalLineTo(14.5f)
                lineTo(15.938f, 5.835f)
                curveTo(15.979f, 5.944f, 16f, 6.06f, 16f, 6.176f)
                verticalLineTo(8f)
                curveTo(16f, 10.209f, 14.209f, 12f, 12f, 12f)
                curveTo(9.791f, 12f, 8f, 10.209f, 8f, 8f)
                verticalLineTo(6.176f)
                close()
            }
        }.build()

        return _BuildingStore!!
    }

@Suppress("ObjectPropertyName")
private var _BuildingStore: ImageVector? = null

@Preview
@Composable
private fun BuildingStorePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.BuildingStore, contentDescription = null)
    }
}
