package fluent.ui.system.icons.filled

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

public val FluentIcons.Filled.PresenceBusy: ImageVector
    get() {
        if (_PresenceBusy != null) {
            return _PresenceBusy!!
        }
        _PresenceBusy = ImageVector.Builder(
            name = "Filled.PresenceBusy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(24f, 12f)
                curveTo(24f, 18.627f, 18.627f, 24f, 12f, 24f)
                curveTo(5.373f, 24f, 0f, 18.627f, 0f, 12f)
                curveTo(0f, 5.373f, 5.373f, 0f, 12f, 0f)
                curveTo(18.627f, 0f, 24f, 5.373f, 24f, 12f)
                close()
            }
        }.build()

        return _PresenceBusy!!
    }

@Suppress("ObjectPropertyName")
private var _PresenceBusy: ImageVector? = null

@Preview
@Composable
private fun PresenceBusyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PresenceBusy, contentDescription = null)
    }
}
