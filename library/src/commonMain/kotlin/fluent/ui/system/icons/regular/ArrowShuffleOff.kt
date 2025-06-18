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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.ArrowShuffleOff: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowShuffleOff",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.28f, 2.22f)
            curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
            curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
            lineTo(6.916f, 7.976f)
            curveTo(5.709f, 7.382f, 4.347f, 7f, 2.75f, 7f)
            curveTo(2.336f, 7f, 2f, 7.336f, 2f, 7.75f)
            curveTo(2f, 8.164f, 2.336f, 8.5f, 2.75f, 8.5f)
            curveTo(5.4f, 8.5f, 7.283f, 9.731f, 9.136f, 11.332f)
            curveTo(9.331f, 11.156f, 9.528f, 10.975f, 9.73f, 10.79f)
            lineTo(10.438f, 11.498f)
            curveTo(8.121f, 13.627f, 6.018f, 15.5f, 2.75f, 15.5f)
            curveTo(2.336f, 15.5f, 2f, 15.836f, 2f, 16.25f)
            curveTo(2f, 16.664f, 2.336f, 17f, 2.75f, 17f)
            curveTo(6.668f, 17f, 9.173f, 14.698f, 11.442f, 12.612f)
            lineTo(11.499f, 12.56f)
            lineTo(12.207f, 13.268f)
            curveTo(12.199f, 13.275f, 12.192f, 13.281f, 12.184f, 13.288f)
            lineTo(12.052f, 13.41f)
            curveTo(11.952f, 13.502f, 11.851f, 13.595f, 11.749f, 13.689f)
            curveTo(12.686f, 14.509f, 13.692f, 15.296f, 14.836f, 15.897f)
            lineTo(20.719f, 21.781f)
            curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
            curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
            lineTo(3.28f, 2.22f)
            close()
            moveTo(18.661f, 15.479f)
            lineTo(20.871f, 17.689f)
            lineTo(21.78f, 16.78f)
            curveTo(21.921f, 16.639f, 22f, 16.449f, 22f, 16.25f)
            curveTo(22f, 16.051f, 21.921f, 15.86f, 21.78f, 15.719f)
            lineTo(19.28f, 13.219f)
            curveTo(18.987f, 12.927f, 18.513f, 12.927f, 18.22f, 13.219f)
            curveTo(17.927f, 13.512f, 17.927f, 13.987f, 18.22f, 14.28f)
            lineTo(19.439f, 15.5f)
            horizontalLineTo(19.25f)
            curveTo(19.049f, 15.5f, 18.853f, 15.493f, 18.661f, 15.479f)
            close()
            moveTo(12.699f, 9.517f)
            lineTo(13.769f, 10.587f)
            curveTo(15.347f, 9.365f, 17.029f, 8.5f, 19.25f, 8.5f)
            horizontalLineTo(19.439f)
            lineTo(18.22f, 9.72f)
            curveTo(17.927f, 10.013f, 17.927f, 10.487f, 18.22f, 10.78f)
            curveTo(18.513f, 11.073f, 18.987f, 11.073f, 19.28f, 10.78f)
            lineTo(21.78f, 8.28f)
            curveTo(21.921f, 8.14f, 22f, 7.949f, 22f, 7.75f)
            curveTo(22f, 7.551f, 21.921f, 7.36f, 21.78f, 7.22f)
            lineTo(19.28f, 4.72f)
            curveTo(18.987f, 4.427f, 18.513f, 4.427f, 18.22f, 4.72f)
            curveTo(17.927f, 5.013f, 17.927f, 5.487f, 18.22f, 5.78f)
            lineTo(19.439f, 7f)
            horizontalLineTo(19.25f)
            curveTo(16.509f, 7f, 14.46f, 8.127f, 12.699f, 9.517f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowShuffleOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ArrowShuffleOff, contentDescription = null)
    }
}
