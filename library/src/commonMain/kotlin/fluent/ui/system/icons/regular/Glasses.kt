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

public val FluentIcons.Regular.Glasses: ImageVector
    get() {
        if (_Glasses != null) {
            return _Glasses!!
        }
        _Glasses = ImageVector.Builder(
            name = "Regular.Glasses",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(7.909f, 5f)
                horizontalLineTo(9.249f)
                curveTo(9.664f, 5f, 9.999f, 5.336f, 9.999f, 5.75f)
                curveTo(9.999f, 6.13f, 9.717f, 6.443f, 9.351f, 6.493f)
                lineTo(9.249f, 6.5f)
                horizontalLineTo(7.909f)
                curveTo(7.734f, 6.5f, 7.566f, 6.561f, 7.432f, 6.671f)
                lineTo(7.357f, 6.743f)
                lineTo(5.283f, 8.999f)
                lineTo(8.749f, 9f)
                curveTo(9.908f, 9f, 10.863f, 9.877f, 10.986f, 11.004f)
                horizontalLineTo(13.013f)
                curveTo(13.136f, 9.877f, 14.09f, 9f, 15.25f, 9f)
                lineTo(18.727f, 8.999f)
                lineTo(16.644f, 6.741f)
                curveTo(16.525f, 6.613f, 16.367f, 6.531f, 16.196f, 6.507f)
                lineTo(16.093f, 6.5f)
                horizontalLineTo(14.747f)
                curveTo(14.333f, 6.5f, 13.997f, 6.164f, 13.997f, 5.75f)
                curveTo(13.997f, 5.37f, 14.279f, 5.057f, 14.645f, 5.007f)
                lineTo(14.747f, 5f)
                horizontalLineTo(16.093f)
                curveTo(16.658f, 5f, 17.2f, 5.213f, 17.613f, 5.592f)
                lineTo(17.746f, 5.724f)
                lineTo(21.388f, 9.671f)
                curveTo(21.438f, 9.726f, 21.479f, 9.786f, 21.51f, 9.849f)
                curveTo(21.816f, 10.233f, 21.999f, 10.72f, 21.999f, 11.25f)
                verticalLineTo(14.746f)
                curveTo(21.999f, 16.541f, 20.544f, 17.996f, 18.749f, 17.996f)
                horizontalLineTo(16.25f)
                curveTo(14.455f, 17.996f, 13f, 16.541f, 13f, 14.746f)
                lineTo(12.999f, 12.504f)
                horizontalLineTo(10.998f)
                lineTo(10.999f, 14.746f)
                curveTo(10.999f, 16.541f, 9.544f, 17.996f, 7.749f, 17.996f)
                horizontalLineTo(5.25f)
                curveTo(3.455f, 17.996f, 2f, 16.541f, 2f, 14.746f)
                verticalLineTo(11.25f)
                curveTo(2f, 10.688f, 2.206f, 10.174f, 2.546f, 9.78f)
                lineTo(2.584f, 9.725f)
                lineTo(2.628f, 9.673f)
                lineTo(6.252f, 5.728f)
                curveTo(6.635f, 5.31f, 7.161f, 5.055f, 7.721f, 5.008f)
                lineTo(7.909f, 5f)
                horizontalLineTo(9.249f)
                horizontalLineTo(7.909f)
                close()
                moveTo(8.749f, 10.5f)
                horizontalLineTo(4.25f)
                curveTo(3.836f, 10.5f, 3.5f, 10.835f, 3.5f, 11.25f)
                verticalLineTo(14.746f)
                curveTo(3.5f, 15.713f, 4.284f, 16.496f, 5.25f, 16.496f)
                horizontalLineTo(7.749f)
                curveTo(8.715f, 16.496f, 9.499f, 15.713f, 9.499f, 14.746f)
                verticalLineTo(11.25f)
                curveTo(9.499f, 10.835f, 9.163f, 10.5f, 8.749f, 10.5f)
                close()
                moveTo(19.749f, 10.5f)
                horizontalLineTo(15.25f)
                curveTo(14.836f, 10.5f, 14.5f, 10.835f, 14.5f, 11.25f)
                verticalLineTo(14.746f)
                curveTo(14.5f, 15.713f, 15.283f, 16.496f, 16.25f, 16.496f)
                horizontalLineTo(18.749f)
                curveTo(19.715f, 16.496f, 20.499f, 15.713f, 20.499f, 14.746f)
                verticalLineTo(11.25f)
                curveTo(20.499f, 10.835f, 20.163f, 10.5f, 19.749f, 10.5f)
                close()
            }
        }.build()

        return _Glasses!!
    }

@Suppress("ObjectPropertyName")
private var _Glasses: ImageVector? = null

@Preview
@Composable
private fun GlassesPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Glasses, contentDescription = null)
    }
}
