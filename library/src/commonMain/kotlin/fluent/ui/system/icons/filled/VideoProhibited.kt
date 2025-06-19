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

public val FluentIcons.Filled.VideoProhibited: ImageVector
    get() {
        if (_VideoProhibited != null) {
            return _VideoProhibited!!
        }
        _VideoProhibited = ImageVector.Builder(
            name = "Filled.VideoProhibited",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11f, 17.5f)
                curveTo(11f, 14.426f, 13.133f, 11.851f, 16f, 11.174f)
                verticalLineTo(8.25f)
                curveTo(16f, 6.455f, 14.545f, 5f, 12.75f, 5f)
                horizontalLineTo(5.25f)
                curveTo(3.455f, 5f, 2f, 6.455f, 2f, 8.25f)
                verticalLineTo(16.75f)
                curveTo(2f, 18.545f, 3.455f, 20f, 5.25f, 20f)
                horizontalLineTo(11.498f)
                curveTo(11.177f, 19.23f, 11f, 18.386f, 11f, 17.5f)
                close()
                moveTo(17.5f, 11f)
                curveTo(19.247f, 11f, 20.832f, 11.689f, 22f, 12.81f)
                verticalLineTo(7.041f)
                curveTo(22f, 6.804f, 21.916f, 6.574f, 21.762f, 6.393f)
                curveTo(21.404f, 5.973f, 20.773f, 5.921f, 20.352f, 6.279f)
                lineTo(17f, 9.128f)
                verticalLineTo(11.019f)
                curveTo(17.165f, 11.006f, 17.332f, 11f, 17.5f, 11f)
                close()
                moveTo(23f, 17.5f)
                curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
                curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
                curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
                close()
                moveTo(13.5f, 17.5f)
                curveTo(13.5f, 18.333f, 13.755f, 19.108f, 14.191f, 19.748f)
                lineTo(19.748f, 14.191f)
                curveTo(19.108f, 13.755f, 18.333f, 13.5f, 17.5f, 13.5f)
                curveTo(15.291f, 13.5f, 13.5f, 15.291f, 13.5f, 17.5f)
                close()
                moveTo(17.5f, 21.5f)
                curveTo(19.709f, 21.5f, 21.5f, 19.709f, 21.5f, 17.5f)
                curveTo(21.5f, 16.667f, 21.245f, 15.892f, 20.809f, 15.252f)
                lineTo(15.252f, 20.809f)
                curveTo(15.892f, 21.245f, 16.667f, 21.5f, 17.5f, 21.5f)
                close()
            }
        }.build()

        return _VideoProhibited!!
    }

@Suppress("ObjectPropertyName")
private var _VideoProhibited: ImageVector? = null

@Preview
@Composable
private fun VideoProhibitedPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.VideoProhibited, contentDescription = null)
    }
}
