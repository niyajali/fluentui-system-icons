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

public val FluentIcons.Regular.ShiftsAvailability: ImageVector
    get() {
        if (_ShiftsAvailability != null) {
            return _ShiftsAvailability!!
        }
        _ShiftsAvailability = ImageVector.Builder(
            name = "Regular.ShiftsAvailability",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(8.5f, 3.5f)
                curveTo(5.739f, 3.5f, 3.5f, 5.739f, 3.5f, 8.5f)
                curveTo(3.5f, 11.185f, 5.616f, 13.375f, 8.271f, 13.495f)
                curveTo(8.139f, 13.973f, 8.052f, 14.471f, 8.018f, 14.982f)
                curveTo(4.653f, 14.736f, 2f, 11.928f, 2f, 8.5f)
                curveTo(2f, 4.91f, 4.91f, 2f, 8.5f, 2f)
                curveTo(11.928f, 2f, 14.736f, 4.653f, 14.982f, 8.018f)
                curveTo(14.471f, 8.052f, 13.973f, 8.139f, 13.495f, 8.271f)
                curveTo(13.375f, 5.616f, 11.185f, 3.5f, 8.5f, 3.5f)
                close()
                moveTo(14.278f, 13.234f)
                curveTo(13.983f, 12.943f, 13.509f, 12.945f, 13.217f, 13.239f)
                curveTo(12.926f, 13.533f, 12.928f, 14.008f, 13.222f, 14.3f)
                lineTo(14.437f, 15.503f)
                lineTo(13.22f, 16.72f)
                curveTo(12.927f, 17.013f, 12.927f, 17.487f, 13.22f, 17.78f)
                curveTo(13.513f, 18.073f, 13.988f, 18.073f, 14.28f, 17.78f)
                lineTo(15.499f, 16.561f)
                lineTo(16.715f, 17.78f)
                curveTo(17.007f, 18.073f, 17.482f, 18.073f, 17.775f, 17.781f)
                curveTo(18.069f, 17.488f, 18.069f, 17.014f, 17.777f, 16.72f)
                lineTo(16.562f, 15.503f)
                lineTo(17.774f, 14.299f)
                curveTo(18.068f, 14.007f, 18.07f, 13.533f, 17.778f, 13.239f)
                curveTo(17.486f, 12.945f, 17.011f, 12.943f, 16.717f, 13.235f)
                lineTo(15.499f, 14.444f)
                lineTo(14.278f, 13.234f)
                close()
                moveTo(15.5f, 9f)
                curveTo(11.91f, 9f, 9f, 11.91f, 9f, 15.5f)
                curveTo(9f, 19.09f, 11.91f, 22f, 15.5f, 22f)
                curveTo(19.09f, 22f, 22f, 19.09f, 22f, 15.5f)
                curveTo(22f, 11.91f, 19.09f, 9f, 15.5f, 9f)
                close()
                moveTo(10.5f, 15.5f)
                curveTo(10.5f, 12.739f, 12.739f, 10.5f, 15.5f, 10.5f)
                curveTo(18.261f, 10.5f, 20.5f, 12.739f, 20.5f, 15.5f)
                curveTo(20.5f, 18.261f, 18.261f, 20.5f, 15.5f, 20.5f)
                curveTo(12.739f, 20.5f, 10.5f, 18.261f, 10.5f, 15.5f)
                close()
                moveTo(11.28f, 6.72f)
                curveTo(11.573f, 7.013f, 11.573f, 7.487f, 11.28f, 7.78f)
                lineTo(8.28f, 10.78f)
                curveTo(8.14f, 10.921f, 7.949f, 11f, 7.75f, 11f)
                curveTo(7.551f, 11f, 7.36f, 10.921f, 7.219f, 10.78f)
                lineTo(5.72f, 9.278f)
                curveTo(5.427f, 8.985f, 5.427f, 8.51f, 5.72f, 8.217f)
                curveTo(6.013f, 7.925f, 6.488f, 7.925f, 6.781f, 8.218f)
                lineTo(7.75f, 9.189f)
                lineTo(10.22f, 6.72f)
                curveTo(10.512f, 6.427f, 10.987f, 6.427f, 11.28f, 6.72f)
                close()
            }
        }.build()

        return _ShiftsAvailability!!
    }

@Suppress("ObjectPropertyName")
private var _ShiftsAvailability: ImageVector? = null

@Preview
@Composable
private fun ShiftsAvailabilityPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ShiftsAvailability, contentDescription = null)
    }
}
