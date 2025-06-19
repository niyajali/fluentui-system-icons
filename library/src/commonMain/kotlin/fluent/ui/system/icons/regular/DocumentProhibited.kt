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

public val FluentIcons.Regular.DocumentProhibited: ImageVector
    get() {
        if (_DocumentProhibited != null) {
            return _DocumentProhibited!!
        }
        _DocumentProhibited = ImageVector.Builder(
            name = "Regular.DocumentProhibited",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(18.5f, 20f)
                curveTo(18.5f, 20.275f, 18.276f, 20.5f, 18f, 20.5f)
                horizontalLineTo(12.268f)
                curveTo(11.981f, 21.051f, 11.617f, 21.556f, 11.19f, 22f)
                horizontalLineTo(18f)
                curveTo(19.104f, 22f, 20f, 21.104f, 20f, 20f)
                verticalLineTo(9.828f)
                curveTo(20f, 9.298f, 19.789f, 8.789f, 19.414f, 8.414f)
                lineTo(13.585f, 2.586f)
                curveTo(13.57f, 2.571f, 13.553f, 2.558f, 13.536f, 2.545f)
                curveTo(13.524f, 2.536f, 13.512f, 2.526f, 13.5f, 2.516f)
                curveTo(13.429f, 2.452f, 13.359f, 2.389f, 13.281f, 2.336f)
                curveTo(13.256f, 2.319f, 13.228f, 2.305f, 13.2f, 2.292f)
                curveTo(13.184f, 2.284f, 13.168f, 2.276f, 13.153f, 2.268f)
                curveTo(13.136f, 2.259f, 13.12f, 2.249f, 13.103f, 2.239f)
                curveTo(13.049f, 2.208f, 12.994f, 2.176f, 12.937f, 2.152f)
                curveTo(12.74f, 2.07f, 12.528f, 2.029f, 12.313f, 2.014f)
                curveTo(12.293f, 2.013f, 12.274f, 2.01f, 12.254f, 2.007f)
                curveTo(12.227f, 2.004f, 12.2f, 2f, 12.172f, 2f)
                horizontalLineTo(6f)
                curveTo(4.896f, 2f, 4f, 2.896f, 4f, 4f)
                verticalLineTo(11.498f)
                curveTo(4.474f, 11.3f, 4.977f, 11.157f, 5.5f, 11.076f)
                verticalLineTo(4f)
                curveTo(5.5f, 3.725f, 5.724f, 3.5f, 6f, 3.5f)
                horizontalLineTo(12f)
                verticalLineTo(8f)
                curveTo(12f, 9.104f, 12.896f, 10f, 14f, 10f)
                horizontalLineTo(18.5f)
                verticalLineTo(20f)
                close()
                moveTo(13.5f, 4.621f)
                lineTo(17.378f, 8.5f)
                horizontalLineTo(14f)
                curveTo(13.724f, 8.5f, 13.5f, 8.275f, 13.5f, 8f)
                verticalLineTo(4.621f)
                close()
                moveTo(12f, 17.5f)
                curveTo(12f, 20.538f, 9.538f, 23f, 6.5f, 23f)
                curveTo(3.462f, 23f, 1f, 20.538f, 1f, 17.5f)
                curveTo(1f, 14.462f, 3.462f, 12f, 6.5f, 12f)
                curveTo(9.538f, 12f, 12f, 14.462f, 12f, 17.5f)
                close()
                moveTo(2.5f, 17.5f)
                curveTo(2.5f, 18.333f, 2.755f, 19.108f, 3.191f, 19.748f)
                lineTo(8.748f, 14.191f)
                curveTo(8.108f, 13.755f, 7.334f, 13.5f, 6.5f, 13.5f)
                curveTo(4.291f, 13.5f, 2.5f, 15.291f, 2.5f, 17.5f)
                close()
                moveTo(6.5f, 21.5f)
                curveTo(8.709f, 21.5f, 10.5f, 19.709f, 10.5f, 17.5f)
                curveTo(10.5f, 16.667f, 10.245f, 15.892f, 9.809f, 15.252f)
                lineTo(4.252f, 20.809f)
                curveTo(4.892f, 21.245f, 5.666f, 21.5f, 6.5f, 21.5f)
                close()
            }
        }.build()

        return _DocumentProhibited!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentProhibited: ImageVector? = null

@Preview
@Composable
private fun DocumentProhibitedPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DocumentProhibited, contentDescription = null)
    }
}
