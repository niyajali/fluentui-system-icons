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

public val FluentIcons.Regular.ShieldError: ImageVector
    get() {
        if (_ShieldError != null) {
            return _ShieldError!!
        }
        _ShieldError = ImageVector.Builder(
            name = "Regular.ShieldError",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(20.25f, 5f)
                curveTo(17.587f, 5f, 14.992f, 4.057f, 12.45f, 2.15f)
                curveTo(12.183f, 1.95f, 11.817f, 1.95f, 11.55f, 2.15f)
                curveTo(9.008f, 4.057f, 6.413f, 5f, 3.75f, 5f)
                curveTo(3.336f, 5f, 3f, 5.336f, 3f, 5.75f)
                verticalLineTo(11f)
                curveTo(3f, 16.001f, 5.958f, 19.676f, 11.725f, 21.948f)
                curveTo(11.902f, 22.017f, 12.098f, 22.017f, 12.275f, 21.948f)
                curveTo(18.042f, 19.676f, 21f, 16.001f, 21f, 11f)
                verticalLineTo(5.75f)
                curveTo(21f, 5.336f, 20.664f, 5f, 20.25f, 5f)
                close()
                moveTo(4.5f, 6.478f)
                curveTo(7.077f, 6.326f, 9.581f, 5.388f, 12f, 3.678f)
                curveTo(14.419f, 5.388f, 16.923f, 6.326f, 19.5f, 6.478f)
                verticalLineTo(11f)
                curveTo(19.5f, 15.256f, 17.047f, 18.379f, 12f, 20.442f)
                curveTo(6.953f, 18.379f, 4.5f, 15.256f, 4.5f, 11f)
                verticalLineTo(6.478f)
                close()
                moveTo(12.743f, 7.652f)
                curveTo(12.693f, 7.286f, 12.38f, 7.004f, 12f, 7.004f)
                curveTo(11.586f, 7.004f, 11.25f, 7.339f, 11.25f, 7.754f)
                verticalLineTo(14.252f)
                lineTo(11.257f, 14.354f)
                curveTo(11.307f, 14.72f, 11.62f, 15.002f, 12f, 15.002f)
                curveTo(12.414f, 15.002f, 12.75f, 14.667f, 12.75f, 14.252f)
                verticalLineTo(7.754f)
                lineTo(12.743f, 7.652f)
                close()
                moveTo(12f, 18f)
                curveTo(12.552f, 18f, 13f, 17.552f, 13f, 17f)
                curveTo(13f, 16.448f, 12.552f, 16f, 12f, 16f)
                curveTo(11.448f, 16f, 11f, 16.448f, 11f, 17f)
                curveTo(11f, 17.552f, 11.448f, 18f, 12f, 18f)
                close()
            }
        }.build()

        return _ShieldError!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldError: ImageVector? = null

@Preview
@Composable
private fun ShieldErrorPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ShieldError, contentDescription = null)
    }
}
