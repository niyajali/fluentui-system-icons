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

public val FluentIcons.Regular.Checkbox2: ImageVector
    get() {
        if (_Checkbox2 != null) {
            return _Checkbox2!!
        }
        _Checkbox2 = ImageVector.Builder(
            name = "Regular.Checkbox2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.25f, 3f)
                curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
                horizontalLineTo(16.257f)
                curveTo(16.29f, 20.419f, 16.436f, 19.923f, 16.643f, 19.5f)
                horizontalLineTo(6.25f)
                curveTo(5.284f, 19.5f, 4.5f, 18.716f, 4.5f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(4.5f, 5.284f, 5.284f, 4.5f, 6.25f, 4.5f)
                horizontalLineTo(17.75f)
                curveTo(18.716f, 4.5f, 19.5f, 5.284f, 19.5f, 6.25f)
                verticalLineTo(13.5f)
                curveTo(19.726f, 13.5f, 19.952f, 13.521f, 20.175f, 13.565f)
                curveTo(20.452f, 13.619f, 20.732f, 13.711f, 21f, 13.845f)
                verticalLineTo(6.25f)
                curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
                horizontalLineTo(6.25f)
                close()
                moveTo(17.808f, 19.499f)
                curveTo(17.521f, 19.894f, 17.305f, 20.382f, 17.259f, 21f)
                curveTo(17.253f, 21.081f, 17.25f, 21.164f, 17.25f, 21.25f)
                curveTo(17.25f, 21.664f, 17.586f, 22f, 18f, 22f)
                horizontalLineTo(21f)
                curveTo(21.414f, 22f, 21.75f, 21.664f, 21.75f, 21.25f)
                curveTo(21.75f, 20.836f, 21.414f, 20.5f, 21f, 20.5f)
                horizontalLineTo(18.943f)
                curveTo(19.138f, 20.169f, 19.478f, 19.896f, 19.94f, 19.562f)
                curveTo(19.968f, 19.542f, 19.997f, 19.521f, 20.026f, 19.5f)
                curveTo(20.041f, 19.49f, 20.056f, 19.479f, 20.071f, 19.468f)
                curveTo(20.289f, 19.312f, 20.543f, 19.131f, 20.787f, 18.911f)
                curveTo(21.291f, 18.454f, 21.75f, 17.828f, 21.75f, 16.91f)
                curveTo(21.75f, 16.276f, 21.582f, 15.726f, 21.246f, 15.301f)
                curveTo(21.169f, 15.205f, 21.087f, 15.119f, 21f, 15.041f)
                curveTo(20.701f, 14.776f, 20.345f, 14.617f, 19.982f, 14.546f)
                curveTo(19.824f, 14.515f, 19.662f, 14.5f, 19.5f, 14.5f)
                curveTo(18.737f, 14.5f, 17.956f, 14.835f, 17.442f, 15.407f)
                curveTo(17.165f, 15.715f, 17.191f, 16.189f, 17.499f, 16.466f)
                curveTo(17.807f, 16.743f, 18.281f, 16.717f, 18.558f, 16.409f)
                curveTo(18.789f, 16.152f, 19.165f, 16f, 19.5f, 16f)
                curveTo(19.566f, 16f, 19.631f, 16.006f, 19.693f, 16.018f)
                curveTo(19.862f, 16.051f, 19.985f, 16.126f, 20.07f, 16.233f)
                curveTo(20.155f, 16.34f, 20.25f, 16.542f, 20.25f, 16.91f)
                curveTo(20.25f, 17.358f, 20.016f, 17.628f, 19.476f, 18.041f)
                curveTo(19.354f, 18.134f, 19.215f, 18.235f, 19.06f, 18.347f)
                curveTo(18.666f, 18.632f, 18.178f, 18.989f, 17.808f, 19.499f)
                close()
                moveTo(17.28f, 9.281f)
                curveTo(17.573f, 8.988f, 17.573f, 8.513f, 17.281f, 8.22f)
                curveTo(16.988f, 7.927f, 16.513f, 7.927f, 16.22f, 8.219f)
                lineTo(9.997f, 14.436f)
                lineTo(7.781f, 12.22f)
                curveTo(7.488f, 11.927f, 7.013f, 11.927f, 6.72f, 12.22f)
                curveTo(6.427f, 12.512f, 6.427f, 12.987f, 6.72f, 13.28f)
                lineTo(9.466f, 16.026f)
                curveTo(9.759f, 16.319f, 10.233f, 16.319f, 10.526f, 16.027f)
                lineTo(17.28f, 9.281f)
                close()
            }
        }.build()

        return _Checkbox2!!
    }

@Suppress("ObjectPropertyName")
private var _Checkbox2: ImageVector? = null

@Preview
@Composable
private fun Checkbox2Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Checkbox2, contentDescription = null)
    }
}
