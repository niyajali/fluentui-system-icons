package fluent.ui.system.icons.regular

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.SurfaceHub: ImageVector
    get() {
        if (_SurfaceHub != null) {
            return _SurfaceHub!!
        }
        _SurfaceHub = ImageVector.Builder(
            name = "Regular.SurfaceHub",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(19.25f, 2f)
                curveTo(19.661f, 2f, 19.988f, 2.329f, 20f, 2.727f)
                lineTo(19.996f, 2.829f)
                lineTo(18.996f, 12.328f)
                curveTo(18.959f, 12.675f, 18.69f, 12.947f, 18.353f, 12.993f)
                lineTo(18.25f, 13f)
                horizontalLineTo(17.521f)
                lineTo(18.988f, 21.118f)
                lineTo(18.999f, 21.22f)
                curveTo(19.015f, 21.589f, 18.757f, 21.922f, 18.383f, 21.99f)
                curveTo(18.009f, 22.057f, 17.65f, 21.835f, 17.537f, 21.484f)
                lineTo(17.512f, 21.385f)
                lineTo(16.9f, 18f)
                horizontalLineTo(14.103f)
                lineTo(13.496f, 21.384f)
                curveTo(13.422f, 21.792f, 13.032f, 22.063f, 12.625f, 21.99f)
                curveTo(12.251f, 21.923f, 11.992f, 21.589f, 12.008f, 21.22f)
                lineTo(12.019f, 21.119f)
                lineTo(12.579f, 18f)
                horizontalLineTo(8.103f)
                lineTo(7.496f, 21.384f)
                curveTo(7.422f, 21.792f, 7.032f, 22.063f, 6.625f, 21.99f)
                curveTo(6.251f, 21.923f, 5.992f, 21.589f, 6.008f, 21.22f)
                lineTo(6.019f, 21.119f)
                lineTo(7.478f, 13f)
                horizontalLineTo(4.75f)
                curveTo(4.339f, 13f, 4.011f, 12.671f, 4f, 12.273f)
                lineTo(4.004f, 12.172f)
                lineTo(5.004f, 2.671f)
                curveTo(5.04f, 2.324f, 5.31f, 2.053f, 5.647f, 2.007f)
                lineTo(5.75f, 2f)
                horizontalLineTo(19.25f)
                close()
                moveTo(13.478f, 13f)
                horizontalLineTo(9.002f)
                lineTo(8.373f, 16.5f)
                horizontalLineTo(12.849f)
                lineTo(13.478f, 13f)
                close()
                moveTo(15.996f, 13f)
                horizontalLineTo(15.002f)
                lineTo(14.373f, 16.5f)
                horizontalLineTo(16.628f)
                lineTo(15.996f, 13f)
                close()
                moveTo(18.417f, 3.5f)
                horizontalLineTo(6.424f)
                lineTo(5.582f, 11.5f)
                horizontalLineTo(17.575f)
                lineTo(18.417f, 3.5f)
                close()
            }
        }.build()

        return _SurfaceHub!!
    }

@Suppress("ObjectPropertyName")
private var _SurfaceHub: ImageVector? = null

@Preview
@Composable
private fun SurfaceHubPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.SurfaceHub, contentDescription = null)
    }
}
