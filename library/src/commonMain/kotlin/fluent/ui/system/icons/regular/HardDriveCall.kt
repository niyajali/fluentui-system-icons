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

public val FluentUi.Regular.HardDriveCall: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.HardDriveCall",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.415f, 5.27f)
            curveTo(5.791f, 4.493f, 6.578f, 4f, 7.441f, 4f)
            horizontalLineTo(16.559f)
            curveTo(17.422f, 4f, 18.209f, 4.493f, 18.585f, 5.27f)
            lineTo(20.873f, 9.999f)
            curveTo(20.35f, 9.988f, 19.843f, 10.162f, 19.439f, 10.479f)
            lineTo(17.235f, 5.923f)
            curveTo(17.109f, 5.664f, 16.847f, 5.5f, 16.559f, 5.5f)
            horizontalLineTo(7.441f)
            curveTo(7.153f, 5.5f, 6.891f, 5.664f, 6.765f, 5.923f)
            lineTo(4.309f, 11f)
            horizontalLineTo(18.957f)
            curveTo(18.871f, 11.13f, 18.797f, 11.27f, 18.738f, 11.421f)
            lineTo(18.312f, 12.5f)
            horizontalLineTo(4.25f)
            curveTo(3.836f, 12.5f, 3.5f, 12.836f, 3.5f, 13.25f)
            verticalLineTo(16.75f)
            curveTo(3.5f, 17.164f, 3.836f, 17.5f, 4.25f, 17.5f)
            horizontalLineTo(15.561f)
            curveTo(15.462f, 17.587f, 15.37f, 17.683f, 15.286f, 17.789f)
            lineTo(14.486f, 18.799f)
            curveTo(14.435f, 18.864f, 14.387f, 18.931f, 14.344f, 19f)
            horizontalLineTo(4.25f)
            curveTo(3.007f, 19f, 2f, 17.993f, 2f, 16.75f)
            verticalLineTo(13.073f)
            curveTo(2f, 12.583f, 2.111f, 12.099f, 2.324f, 11.658f)
            lineTo(5.415f, 5.27f)
            close()
            moveTo(19.192f, 12.995f)
            lineTo(19.668f, 11.79f)
            curveTo(19.91f, 11.176f, 20.589f, 10.857f, 21.216f, 11.062f)
            lineTo(21.647f, 11.203f)
            curveTo(22.371f, 11.44f, 22.973f, 12.009f, 22.997f, 12.772f)
            curveTo(23.096f, 15.883f, 20.521f, 20.354f, 17.784f, 21.827f)
            curveTo(17.111f, 22.189f, 16.316f, 21.95f, 15.748f, 21.436f)
            lineTo(15.412f, 21.131f)
            curveTo(14.923f, 20.688f, 14.861f, 19.942f, 15.27f, 19.425f)
            lineTo(16.07f, 18.415f)
            curveTo(16.36f, 18.048f, 16.837f, 17.884f, 17.291f, 17.995f)
            lineTo(18.582f, 18.308f)
            curveTo(19.685f, 17.578f, 20.277f, 16.552f, 20.356f, 15.229f)
            lineTo(19.44f, 14.265f)
            curveTo(19.117f, 13.926f, 19.021f, 13.43f, 19.192f, 12.995f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun HardDriveCallPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.HardDriveCall, contentDescription = null)
    }
}
