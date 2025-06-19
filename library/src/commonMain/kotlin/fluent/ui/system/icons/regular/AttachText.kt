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

public val FluentIcons.Regular.AttachText: ImageVector
    get() {
        if (_AttachText != null) {
            return _AttachText!!
        }
        _AttachText = ImageVector.Builder(
            name = "Regular.AttachText",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(7.25f, 3.5f)
                curveTo(9.528f, 3.5f, 11.388f, 5.293f, 11.495f, 7.544f)
                lineTo(11.5f, 7.75f)
                verticalLineTo(18.5f)
                curveTo(11.5f, 19.881f, 10.381f, 21f, 9f, 21f)
                curveTo(7.675f, 21f, 6.59f, 19.969f, 6.505f, 18.664f)
                lineTo(6.5f, 18.5f)
                verticalLineTo(9f)
                curveTo(6.5f, 8.586f, 6.836f, 8.25f, 7.25f, 8.25f)
                curveTo(7.63f, 8.25f, 7.943f, 8.532f, 7.993f, 8.898f)
                lineTo(8f, 9f)
                verticalLineTo(18.5f)
                curveTo(8f, 19.052f, 8.448f, 19.5f, 9f, 19.5f)
                curveTo(9.513f, 19.5f, 9.936f, 19.114f, 9.993f, 18.617f)
                lineTo(10f, 18.5f)
                verticalLineTo(7.75f)
                curveTo(10f, 6.231f, 8.769f, 5f, 7.25f, 5f)
                curveTo(5.787f, 5f, 4.592f, 6.142f, 4.505f, 7.582f)
                lineTo(4.5f, 7.75f)
                verticalLineTo(17f)
                curveTo(4.5f, 17.414f, 4.164f, 17.75f, 3.75f, 17.75f)
                curveTo(3.37f, 17.75f, 3.057f, 17.468f, 3.007f, 17.102f)
                lineTo(3f, 17f)
                verticalLineTo(7.75f)
                curveTo(3f, 5.403f, 4.903f, 3.5f, 7.25f, 3.5f)
                close()
                moveTo(16.25f, 16f)
                curveTo(16.664f, 16f, 17f, 16.336f, 17f, 16.75f)
                curveTo(17f, 17.13f, 16.718f, 17.444f, 16.352f, 17.493f)
                lineTo(16.25f, 17.5f)
                horizontalLineTo(13.75f)
                curveTo(13.336f, 17.5f, 13f, 17.164f, 13f, 16.75f)
                curveTo(13f, 16.37f, 13.282f, 16.056f, 13.648f, 16.007f)
                lineTo(13.75f, 16f)
                horizontalLineTo(16.25f)
                close()
                moveTo(20.25f, 13f)
                curveTo(20.664f, 13f, 21f, 13.336f, 21f, 13.75f)
                curveTo(21f, 14.13f, 20.718f, 14.443f, 20.352f, 14.493f)
                lineTo(20.25f, 14.5f)
                horizontalLineTo(13.75f)
                curveTo(13.336f, 14.5f, 13f, 14.164f, 13f, 13.75f)
                curveTo(13f, 13.37f, 13.282f, 13.057f, 13.648f, 13.007f)
                lineTo(13.75f, 13f)
                horizontalLineTo(20.25f)
                close()
                moveTo(20.25f, 10f)
                curveTo(20.664f, 10f, 21f, 10.336f, 21f, 10.75f)
                curveTo(21f, 11.13f, 20.718f, 11.443f, 20.352f, 11.493f)
                lineTo(20.25f, 11.5f)
                horizontalLineTo(13.75f)
                curveTo(13.336f, 11.5f, 13f, 11.164f, 13f, 10.75f)
                curveTo(13f, 10.37f, 13.282f, 10.057f, 13.648f, 10.007f)
                lineTo(13.75f, 10f)
                horizontalLineTo(20.25f)
                close()
                moveTo(20.25f, 7f)
                curveTo(20.664f, 7f, 21f, 7.336f, 21f, 7.75f)
                curveTo(21f, 8.13f, 20.718f, 8.443f, 20.352f, 8.493f)
                lineTo(20.25f, 8.5f)
                horizontalLineTo(13.75f)
                curveTo(13.336f, 8.5f, 13f, 8.164f, 13f, 7.75f)
                curveTo(13f, 7.37f, 13.282f, 7.057f, 13.648f, 7.007f)
                lineTo(13.75f, 7f)
                horizontalLineTo(20.25f)
                close()
            }
        }.build()

        return _AttachText!!
    }

@Suppress("ObjectPropertyName")
private var _AttachText: ImageVector? = null

@Preview
@Composable
private fun AttachTextPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.AttachText, contentDescription = null)
    }
}
