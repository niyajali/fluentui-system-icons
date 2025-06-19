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

public val FluentIcons.Colored.DataPie: ImageVector
    get() {
        if (_DataPie != null) {
            return _DataPie!!
        }
        _DataPie = ImageVector.Builder(
            name = "Colored.DataPie",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF6D37CD),
                        0.641f to Color(0xFFEA71EF)
                    ),
                    start = Offset(19.966f, 22f),
                    end = Offset(-8.78f, -6.746f)
                )
            ) {
                moveTo(11f, 4.784f)
                curveTo(11f, 4.573f, 10.911f, 4.372f, 10.756f, 4.23f)
                curveTo(10.601f, 4.088f, 10.392f, 4.018f, 10.183f, 4.037f)
                curveTo(5.595f, 4.45f, 2f, 8.305f, 2f, 13f)
                curveTo(2f, 17.971f, 6.029f, 22f, 11f, 22f)
                curveTo(15.695f, 22f, 19.55f, 18.405f, 19.963f, 13.817f)
                curveTo(19.982f, 13.608f, 19.912f, 13.4f, 19.77f, 13.244f)
                curveTo(19.628f, 13.089f, 19.427f, 13f, 19.216f, 13f)
                horizontalLineTo(11f)
                verticalLineTo(4.784f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFE23CB4),
                        1f to Color(0xFFEA71EF)
                    ),
                    start = Offset(21.205f, 9.759f),
                    end = Offset(14.399f, 2.004f)
                )
            ) {
                moveTo(12.728f, 2.216f)
                curveTo(12.873f, 2.074f, 13.07f, 1.998f, 13.272f, 2.004f)
                curveTo(18.027f, 2.145f, 21.854f, 5.973f, 21.996f, 10.728f)
                curveTo(22.002f, 10.93f, 21.926f, 11.127f, 21.784f, 11.272f)
                curveTo(21.643f, 11.418f, 21.449f, 11.5f, 21.246f, 11.5f)
                horizontalLineTo(13.25f)
                curveTo(12.836f, 11.5f, 12.5f, 11.164f, 12.5f, 10.75f)
                verticalLineTo(2.754f)
                curveTo(12.5f, 2.551f, 12.582f, 2.357f, 12.728f, 2.216f)
                close()
            }
        }.build()

        return _DataPie!!
    }

@Suppress("ObjectPropertyName")
private var _DataPie: ImageVector? = null

@Preview
@Composable
private fun DataPiePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.DataPie, contentDescription = null)
    }
}
