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

public val FluentIcons.Regular.PresenceUnknown: ImageVector
    get() {
        if (_PresenceUnknown != null) {
            return _PresenceUnknown!!
        }
        _PresenceUnknown = ImageVector.Builder(
            name = "Regular.PresenceUnknown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 3f)
                curveTo(7.029f, 3f, 3f, 7.029f, 3f, 12f)
                curveTo(3f, 16.971f, 7.029f, 21f, 12f, 21f)
                curveTo(16.971f, 21f, 21f, 16.971f, 21f, 12f)
                curveTo(21f, 7.029f, 16.971f, 3f, 12f, 3f)
                close()
                moveTo(0f, 12f)
                curveTo(0f, 5.373f, 5.373f, 0f, 12f, 0f)
                curveTo(18.627f, 0f, 24f, 5.373f, 24f, 12f)
                curveTo(24f, 18.627f, 18.627f, 24f, 12f, 24f)
                curveTo(5.373f, 24f, 0f, 18.627f, 0f, 12f)
                close()
            }
        }.build()

        return _PresenceUnknown!!
    }

@Suppress("ObjectPropertyName")
private var _PresenceUnknown: ImageVector? = null

@Preview
@Composable
private fun PresenceUnknownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PresenceUnknown, contentDescription = null)
    }
}
