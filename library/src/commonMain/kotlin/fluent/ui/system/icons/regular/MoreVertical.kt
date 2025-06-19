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

public val FluentIcons.Regular.MoreVertical: ImageVector
    get() {
        if (_MoreVertical != null) {
            return _MoreVertical!!
        }
        _MoreVertical = ImageVector.Builder(
            name = "Regular.MoreVertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 7.75f)
                curveTo(11.033f, 7.75f, 10.25f, 6.966f, 10.25f, 6f)
                curveTo(10.25f, 5.034f, 11.033f, 4.25f, 12f, 4.25f)
                curveTo(12.967f, 4.25f, 13.75f, 5.034f, 13.75f, 6f)
                curveTo(13.75f, 6.966f, 12.967f, 7.75f, 12f, 7.75f)
                close()
                moveTo(12f, 13.75f)
                curveTo(11.033f, 13.75f, 10.25f, 12.967f, 10.25f, 12f)
                curveTo(10.25f, 11.033f, 11.033f, 10.25f, 12f, 10.25f)
                curveTo(12.967f, 10.25f, 13.75f, 11.033f, 13.75f, 12f)
                curveTo(13.75f, 12.967f, 12.967f, 13.75f, 12f, 13.75f)
                close()
                moveTo(10.25f, 18f)
                curveTo(10.25f, 18.966f, 11.033f, 19.75f, 12f, 19.75f)
                curveTo(12.967f, 19.75f, 13.75f, 18.966f, 13.75f, 18f)
                curveTo(13.75f, 17.034f, 12.967f, 16.25f, 12f, 16.25f)
                curveTo(11.033f, 16.25f, 10.25f, 17.034f, 10.25f, 18f)
                close()
            }
        }.build()

        return _MoreVertical!!
    }

@Suppress("ObjectPropertyName")
private var _MoreVertical: ImageVector? = null

@Preview
@Composable
private fun MoreVerticalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.MoreVertical, contentDescription = null)
    }
}
