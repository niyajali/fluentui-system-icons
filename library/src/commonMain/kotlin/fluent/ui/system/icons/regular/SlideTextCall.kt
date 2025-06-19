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

public val FluentIcons.Regular.SlideTextCall: ImageVector
    get() {
        if (_SlideTextCall != null) {
            return _SlideTextCall!!
        }
        _SlideTextCall = ImageVector.Builder(
            name = "Regular.SlideTextCall",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6f, 8.75f)
                curveTo(6f, 8.336f, 6.336f, 8f, 6.75f, 8f)
                horizontalLineTo(11.25f)
                curveTo(11.664f, 8f, 12f, 8.336f, 12f, 8.75f)
                curveTo(12f, 9.164f, 11.664f, 9.5f, 11.25f, 9.5f)
                horizontalLineTo(6.75f)
                curveTo(6.336f, 9.5f, 6f, 9.164f, 6f, 8.75f)
                close()
                moveTo(6.75f, 11f)
                curveTo(6.336f, 11f, 6f, 11.336f, 6f, 11.75f)
                curveTo(6f, 12.164f, 6.336f, 12.5f, 6.75f, 12.5f)
                horizontalLineTo(15.25f)
                curveTo(15.664f, 12.5f, 16f, 12.164f, 16f, 11.75f)
                curveTo(16f, 11.336f, 15.664f, 11f, 15.25f, 11f)
                horizontalLineTo(6.75f)
                close()
                moveTo(6f, 14.75f)
                curveTo(6f, 14.336f, 6.336f, 14f, 6.75f, 14f)
                horizontalLineTo(13.25f)
                curveTo(13.664f, 14f, 14f, 14.336f, 14f, 14.75f)
                curveTo(14f, 15.164f, 13.664f, 15.5f, 13.25f, 15.5f)
                horizontalLineTo(6.75f)
                curveTo(6.336f, 15.5f, 6f, 15.164f, 6f, 14.75f)
                close()
                moveTo(2f, 6.75f)
                curveTo(2f, 5.231f, 3.231f, 4f, 4.75f, 4f)
                horizontalLineTo(19.25f)
                curveTo(20.769f, 4f, 22f, 5.231f, 22f, 6.75f)
                verticalLineTo(9.267f)
                curveTo(21.985f, 9.262f, 21.971f, 9.257f, 21.956f, 9.252f)
                lineTo(21.525f, 9.111f)
                curveTo(21.183f, 8.999f, 20.834f, 8.974f, 20.5f, 9.023f)
                verticalLineTo(6.75f)
                curveTo(20.5f, 6.06f, 19.94f, 5.5f, 19.25f, 5.5f)
                horizontalLineTo(4.75f)
                curveTo(4.06f, 5.5f, 3.5f, 6.06f, 3.5f, 6.75f)
                verticalLineTo(17.25f)
                curveTo(3.5f, 17.94f, 4.06f, 18.5f, 4.75f, 18.5f)
                horizontalLineTo(14.11f)
                curveTo(13.95f, 18.991f, 13.966f, 19.522f, 14.148f, 20f)
                horizontalLineTo(4.75f)
                curveTo(3.231f, 20f, 2f, 18.769f, 2f, 17.25f)
                verticalLineTo(6.75f)
                close()
                moveTo(19.192f, 11.995f)
                lineTo(19.668f, 10.79f)
                curveTo(19.91f, 10.176f, 20.589f, 9.857f, 21.216f, 10.062f)
                lineTo(21.647f, 10.203f)
                curveTo(22.371f, 10.44f, 22.973f, 11.009f, 22.997f, 11.772f)
                curveTo(23.096f, 14.883f, 20.521f, 19.354f, 17.784f, 20.827f)
                curveTo(17.111f, 21.189f, 16.316f, 20.95f, 15.748f, 20.436f)
                lineTo(15.412f, 20.131f)
                curveTo(14.923f, 19.688f, 14.861f, 18.942f, 15.27f, 18.425f)
                lineTo(16.07f, 17.415f)
                curveTo(16.36f, 17.048f, 16.837f, 16.884f, 17.291f, 16.995f)
                lineTo(18.582f, 17.308f)
                curveTo(19.685f, 16.578f, 20.277f, 15.552f, 20.356f, 14.229f)
                lineTo(19.44f, 13.265f)
                curveTo(19.117f, 12.926f, 19.021f, 12.43f, 19.192f, 11.995f)
                close()
            }
        }.build()

        return _SlideTextCall!!
    }

@Suppress("ObjectPropertyName")
private var _SlideTextCall: ImageVector? = null

@Preview
@Composable
private fun SlideTextCallPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.SlideTextCall, contentDescription = null)
    }
}
