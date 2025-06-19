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

public val FluentIcons.Filled.SpeakerBox: ImageVector
    get() {
        if (_SpeakerBox != null) {
            return _SpeakerBox!!
        }
        _SpeakerBox = ImageVector.Builder(
            name = "Filled.SpeakerBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4f, 5.25f)
                curveTo(4f, 3.455f, 5.455f, 2f, 7.25f, 2f)
                horizontalLineTo(16.75f)
                curveTo(18.545f, 2f, 20f, 3.455f, 20f, 5.25f)
                verticalLineTo(18.75f)
                curveTo(20f, 20.545f, 18.545f, 22f, 16.75f, 22f)
                horizontalLineTo(7.25f)
                curveTo(5.455f, 22f, 4f, 20.545f, 4f, 18.75f)
                verticalLineTo(5.25f)
                close()
                moveTo(12f, 12.5f)
                curveTo(10.895f, 12.5f, 10f, 13.395f, 10f, 14.5f)
                curveTo(10f, 15.605f, 10.895f, 16.5f, 12f, 16.5f)
                curveTo(13.105f, 16.5f, 14f, 15.605f, 14f, 14.5f)
                curveTo(14f, 13.395f, 13.105f, 12.5f, 12f, 12.5f)
                close()
                moveTo(8.5f, 14.5f)
                curveTo(8.5f, 16.433f, 10.067f, 18f, 12f, 18f)
                curveTo(13.933f, 18f, 15.5f, 16.433f, 15.5f, 14.5f)
                curveTo(15.5f, 12.567f, 13.933f, 11f, 12f, 11f)
                curveTo(10.067f, 11f, 8.5f, 12.567f, 8.5f, 14.5f)
                close()
                moveTo(12f, 9f)
                curveTo(12.828f, 9f, 13.5f, 8.328f, 13.5f, 7.5f)
                curveTo(13.5f, 6.672f, 12.828f, 6f, 12f, 6f)
                curveTo(11.172f, 6f, 10.5f, 6.672f, 10.5f, 7.5f)
                curveTo(10.5f, 8.328f, 11.172f, 9f, 12f, 9f)
                close()
            }
        }.build()

        return _SpeakerBox!!
    }

@Suppress("ObjectPropertyName")
private var _SpeakerBox: ImageVector? = null

@Preview
@Composable
private fun SpeakerBoxPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.SpeakerBox, contentDescription = null)
    }
}
