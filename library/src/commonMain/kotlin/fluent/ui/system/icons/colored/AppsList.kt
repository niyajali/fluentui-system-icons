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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Colored.AppsList: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.AppsList",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF36DFF1),
                    1f to Color(0xFF0094F0)
                ),
                start = Offset(7.05f, 1.714f),
                end = Offset(20.7f, 20f)
            )
        ) {
            moveTo(9f, 5f)
            curveTo(9f, 4.448f, 9.448f, 4f, 10f, 4f)
            horizontalLineTo(21f)
            curveTo(21.552f, 4f, 22f, 4.448f, 22f, 5f)
            curveTo(22f, 5.552f, 21.552f, 6f, 21f, 6f)
            horizontalLineTo(10f)
            curveTo(9.448f, 6f, 9f, 5.552f, 9f, 5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF36DFF1),
                    1f to Color(0xFF0094F0)
                ),
                start = Offset(7.05f, 1.714f),
                end = Offset(20.7f, 20f)
            )
        ) {
            moveTo(9f, 12f)
            curveTo(9f, 11.448f, 9.448f, 11f, 10f, 11f)
            horizontalLineTo(21f)
            curveTo(21.552f, 11f, 22f, 11.448f, 22f, 12f)
            curveTo(22f, 12.552f, 21.552f, 13f, 21f, 13f)
            horizontalLineTo(10f)
            curveTo(9.448f, 13f, 9f, 12.552f, 9f, 12f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF36DFF1),
                    1f to Color(0xFF0094F0)
                ),
                start = Offset(7.05f, 1.714f),
                end = Offset(20.7f, 20f)
            )
        ) {
            moveTo(9f, 19f)
            curveTo(9f, 18.448f, 9.448f, 18f, 10f, 18f)
            horizontalLineTo(21f)
            curveTo(21.552f, 18f, 22f, 18.448f, 22f, 19f)
            curveTo(22f, 19.552f, 21.552f, 20f, 21f, 20f)
            horizontalLineTo(10f)
            curveTo(9.448f, 20f, 9f, 19.552f, 9f, 19f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125f to Color(0xFF9C6CFE),
                    1f to Color(0xFF7A41DC)
                ),
                start = Offset(3.426f, 4.659f),
                end = Offset(6.483f, 20.934f)
            )
        ) {
            moveTo(6.248f, 16.002f)
            curveTo(7.214f, 16.002f, 7.998f, 16.786f, 7.998f, 17.752f)
            verticalLineTo(20.25f)
            curveTo(7.998f, 21.216f, 7.214f, 22f, 6.248f, 22f)
            horizontalLineTo(3.75f)
            curveTo(2.783f, 22f, 2f, 21.216f, 2f, 20.25f)
            verticalLineTo(17.752f)
            curveTo(2f, 16.786f, 2.783f, 16.002f, 3.75f, 16.002f)
            horizontalLineTo(6.248f)
            close()
            moveTo(6.248f, 9.001f)
            curveTo(7.214f, 9.001f, 7.998f, 9.785f, 7.998f, 10.751f)
            verticalLineTo(13.249f)
            curveTo(7.998f, 14.215f, 7.214f, 14.999f, 6.248f, 14.999f)
            horizontalLineTo(3.75f)
            curveTo(2.783f, 14.999f, 2f, 14.215f, 2f, 13.249f)
            verticalLineTo(10.751f)
            curveTo(2f, 9.785f, 2.783f, 9.001f, 3.75f, 9.001f)
            horizontalLineTo(6.248f)
            close()
            moveTo(6.248f, 2f)
            curveTo(7.214f, 2f, 7.998f, 2.783f, 7.998f, 3.75f)
            verticalLineTo(6.248f)
            curveTo(7.998f, 7.214f, 7.214f, 7.998f, 6.248f, 7.998f)
            horizontalLineTo(3.75f)
            curveTo(2.783f, 7.998f, 2f, 7.214f, 2f, 6.248f)
            verticalLineTo(3.75f)
            curveTo(2f, 2.783f, 2.783f, 2f, 3.75f, 2f)
            horizontalLineTo(6.248f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun AppsListPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.AppsList, contentDescription = null)
    }
}
