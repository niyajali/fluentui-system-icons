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

public val FluentIcons.Regular.PresenceOof: ImageVector
    get() {
        if (_PresenceOof != null) {
            return _PresenceOof!!
        }
        _PresenceOof = ImageVector.Builder(
            name = "Regular.PresenceOof",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12.562f, 9.057f)
                curveTo(13.148f, 8.471f, 13.148f, 7.521f, 12.562f, 6.935f)
                curveTo(11.977f, 6.35f, 11.027f, 6.35f, 10.441f, 6.935f)
                lineTo(6.437f, 10.94f)
                curveTo(5.851f, 11.525f, 5.851f, 12.475f, 6.437f, 13.061f)
                lineTo(10.441f, 17.065f)
                curveTo(11.027f, 17.651f, 11.977f, 17.651f, 12.562f, 17.065f)
                curveTo(13.148f, 16.479f, 13.148f, 15.53f, 12.562f, 14.944f)
                lineTo(11.119f, 13.5f)
                horizontalLineTo(16.5f)
                curveTo(17.328f, 13.5f, 18f, 12.829f, 18f, 12f)
                curveTo(18f, 11.172f, 17.328f, 10.5f, 16.5f, 10.5f)
                horizontalLineTo(11.119f)
                lineTo(12.562f, 9.057f)
                close()
                moveTo(12f, 0f)
                curveTo(5.373f, 0f, 0f, 5.373f, 0f, 12f)
                curveTo(0f, 18.627f, 5.373f, 24f, 12f, 24f)
                curveTo(18.627f, 24f, 24f, 18.627f, 24f, 12f)
                curveTo(24f, 5.373f, 18.627f, 0f, 12f, 0f)
                close()
                moveTo(3f, 12f)
                curveTo(3f, 7.029f, 7.029f, 3f, 12f, 3f)
                curveTo(16.971f, 3f, 21f, 7.029f, 21f, 12f)
                curveTo(21f, 16.971f, 16.971f, 21f, 12f, 21f)
                curveTo(7.029f, 21f, 3f, 16.971f, 3f, 12f)
                close()
            }
        }.build()

        return _PresenceOof!!
    }

@Suppress("ObjectPropertyName")
private var _PresenceOof: ImageVector? = null

@Preview
@Composable
private fun PresenceOofPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PresenceOof, contentDescription = null)
    }
}
