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

public val FluentIcons.Regular.Info: ImageVector
    get() {
        if (_Info != null) {
            return _Info!!
        }
        _Info = ImageVector.Builder(
            name = "Regular.Info",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12.002f, 1.999f)
                curveTo(17.525f, 1.999f, 22.003f, 6.477f, 22.003f, 12.001f)
                curveTo(22.003f, 17.524f, 17.525f, 22.002f, 12.002f, 22.002f)
                curveTo(6.478f, 22.002f, 2f, 17.524f, 2f, 12.001f)
                curveTo(2f, 6.477f, 6.478f, 1.999f, 12.002f, 1.999f)
                close()
                moveTo(12.002f, 3.499f)
                curveTo(7.306f, 3.499f, 3.5f, 7.305f, 3.5f, 12.001f)
                curveTo(3.5f, 16.696f, 7.306f, 20.502f, 12.002f, 20.502f)
                curveTo(16.697f, 20.502f, 20.503f, 16.696f, 20.503f, 12.001f)
                curveTo(20.503f, 7.305f, 16.697f, 3.499f, 12.002f, 3.499f)
                close()
                moveTo(12f, 10.5f)
                curveTo(12.414f, 10.5f, 12.75f, 10.836f, 12.75f, 11.25f)
                verticalLineTo(16.25f)
                curveTo(12.75f, 16.664f, 12.414f, 17f, 12f, 17f)
                curveTo(11.586f, 17f, 11.25f, 16.664f, 11.25f, 16.25f)
                verticalLineTo(11.25f)
                curveTo(11.25f, 10.836f, 11.586f, 10.5f, 12f, 10.5f)
                close()
                moveTo(12f, 9f)
                curveTo(12.552f, 9f, 13f, 8.552f, 13f, 8f)
                curveTo(13f, 7.448f, 12.552f, 7f, 12f, 7f)
                curveTo(11.448f, 7f, 11f, 7.448f, 11f, 8f)
                curveTo(11f, 8.552f, 11.448f, 9f, 12f, 9f)
                close()
            }
        }.build()

        return _Info!!
    }

@Suppress("ObjectPropertyName")
private var _Info: ImageVector? = null

@Preview
@Composable
private fun InfoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Info, contentDescription = null)
    }
}
