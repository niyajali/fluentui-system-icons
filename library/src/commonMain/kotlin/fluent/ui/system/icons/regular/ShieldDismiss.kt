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

public val FluentIcons.Regular.ShieldDismiss: ImageVector
    get() {
        if (_ShieldDismiss != null) {
            return _ShieldDismiss!!
        }
        _ShieldDismiss = ImageVector.Builder(
            name = "Regular.ShieldDismiss",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12.45f, 2.15f)
                curveTo(14.992f, 4.057f, 17.587f, 5f, 20.25f, 5f)
                curveTo(20.664f, 5f, 21f, 5.336f, 21f, 5.75f)
                verticalLineTo(11f)
                curveTo(21f, 16.001f, 18.042f, 19.676f, 12.275f, 21.948f)
                curveTo(12.098f, 22.017f, 11.902f, 22.017f, 11.725f, 21.948f)
                curveTo(5.958f, 19.676f, 3f, 16.001f, 3f, 11f)
                verticalLineTo(5.75f)
                curveTo(3f, 5.336f, 3.336f, 5f, 3.75f, 5f)
                curveTo(6.413f, 5f, 9.008f, 4.057f, 11.55f, 2.15f)
                curveTo(11.817f, 1.95f, 12.183f, 1.95f, 12.45f, 2.15f)
                close()
                moveTo(12f, 3.678f)
                curveTo(9.581f, 5.388f, 7.077f, 6.326f, 4.5f, 6.478f)
                verticalLineTo(11f)
                curveTo(4.5f, 15.256f, 6.953f, 18.379f, 12f, 20.442f)
                curveTo(17.047f, 18.379f, 19.5f, 15.256f, 19.5f, 11f)
                verticalLineTo(6.478f)
                curveTo(16.923f, 6.326f, 14.419f, 5.388f, 12f, 3.678f)
                close()
                moveTo(9.281f, 8.222f)
                lineTo(12.004f, 10.945f)
                lineTo(14.729f, 8.222f)
                curveTo(14.995f, 7.956f, 15.411f, 7.931f, 15.704f, 8.149f)
                lineTo(15.788f, 8.222f)
                curveTo(16.054f, 8.488f, 16.078f, 8.904f, 15.861f, 9.197f)
                lineTo(15.788f, 9.281f)
                lineTo(13.064f, 12.004f)
                lineTo(15.788f, 14.729f)
                curveTo(16.081f, 15.021f, 16.081f, 15.495f, 15.788f, 15.788f)
                curveTo(15.495f, 16.081f, 15.021f, 16.081f, 14.729f, 15.788f)
                lineTo(12.004f, 13.064f)
                lineTo(9.281f, 15.788f)
                curveTo(9.015f, 16.054f, 8.599f, 16.078f, 8.306f, 15.861f)
                lineTo(8.222f, 15.788f)
                curveTo(7.956f, 15.522f, 7.931f, 15.106f, 8.149f, 14.813f)
                lineTo(8.222f, 14.729f)
                lineTo(10.945f, 12.004f)
                lineTo(8.222f, 9.281f)
                curveTo(7.929f, 8.988f, 7.929f, 8.514f, 8.222f, 8.222f)
                curveTo(8.514f, 7.929f, 8.988f, 7.929f, 9.281f, 8.222f)
                close()
            }
        }.build()

        return _ShieldDismiss!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldDismiss: ImageVector? = null

@Preview
@Composable
private fun ShieldDismissPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ShieldDismiss, contentDescription = null)
    }
}
