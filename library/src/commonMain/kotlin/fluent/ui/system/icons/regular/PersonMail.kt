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

public val FluentIcons.Regular.PersonMail: ImageVector
    get() {
        if (_PersonMail != null) {
            return _PersonMail!!
        }
        _PersonMail = ImageVector.Builder(
            name = "Regular.PersonMail",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11f, 15.5f)
                curveTo(11f, 14.937f, 11.186f, 14.418f, 11.5f, 14f)
                horizontalLineTo(5.253f)
                curveTo(4.011f, 14f, 3.004f, 15.007f, 3.004f, 16.249f)
                verticalLineTo(16.827f)
                curveTo(3.004f, 17.719f, 3.322f, 18.583f, 3.902f, 19.262f)
                curveTo(5.468f, 21.096f, 7.854f, 22.001f, 11f, 22.001f)
                lineTo(11.051f, 22.001f)
                curveTo(11.018f, 21.839f, 11f, 21.672f, 11f, 21.5f)
                lineTo(11f, 20.501f)
                curveTo(8.262f, 20.501f, 6.296f, 19.756f, 5.043f, 18.288f)
                curveTo(4.695f, 17.881f, 4.504f, 17.362f, 4.504f, 16.827f)
                verticalLineTo(16.249f)
                curveTo(4.504f, 15.835f, 4.839f, 15.5f, 5.253f, 15.5f)
                horizontalLineTo(11f)
                close()
                moveTo(11f, 2.005f)
                curveTo(13.762f, 2.005f, 16f, 4.243f, 16f, 7.005f)
                curveTo(16f, 9.766f, 13.762f, 12.005f, 11f, 12.005f)
                curveTo(8.239f, 12.005f, 6f, 9.766f, 6f, 7.005f)
                curveTo(6f, 4.243f, 8.239f, 2.005f, 11f, 2.005f)
                close()
                moveTo(11f, 3.505f)
                curveTo(9.067f, 3.505f, 7.5f, 5.072f, 7.5f, 7.005f)
                curveTo(7.5f, 8.938f, 9.067f, 10.505f, 11f, 10.505f)
                curveTo(12.933f, 10.505f, 14.5f, 8.938f, 14.5f, 7.005f)
                curveTo(14.5f, 5.072f, 12.933f, 3.505f, 11f, 3.505f)
                close()
                moveTo(17.51f, 18.927f)
                lineTo(12.019f, 15.724f)
                curveTo(12.154f, 14.75f, 12.99f, 14f, 14f, 14f)
                horizontalLineTo(21f)
                curveTo(22.095f, 14f, 22.985f, 14.88f, 23f, 15.971f)
                lineTo(17.51f, 18.927f)
                close()
                moveTo(17.737f, 19.941f)
                lineTo(23f, 17.107f)
                verticalLineTo(21f)
                curveTo(23f, 22.105f, 22.105f, 23f, 21f, 23f)
                horizontalLineTo(14f)
                curveTo(12.896f, 23f, 12f, 22.105f, 12f, 21f)
                verticalLineTo(16.871f)
                lineTo(17.249f, 19.932f)
                curveTo(17.399f, 20.02f, 17.584f, 20.023f, 17.737f, 19.941f)
                close()
            }
        }.build()

        return _PersonMail!!
    }

@Suppress("ObjectPropertyName")
private var _PersonMail: ImageVector? = null

@Preview
@Composable
private fun PersonMailPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PersonMail, contentDescription = null)
    }
}
