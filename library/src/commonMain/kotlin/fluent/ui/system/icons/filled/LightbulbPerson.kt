package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Filled.LightbulbPerson: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LightbulbPerson",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.422f, 19.5f)
            lineTo(15.247f, 20.257f)
            curveTo(15.024f, 21.221f, 14.201f, 21.918f, 13.229f, 21.993f)
            lineTo(13.055f, 22f)
            horizontalLineTo(10.944f)
            curveTo(9.954f, 22f, 9.089f, 21.355f, 8.797f, 20.423f)
            lineTo(8.751f, 20.256f)
            lineTo(8.577f, 19.5f)
            horizontalLineTo(15.422f)
            close()
            moveTo(15.77f, 18f)
            lineTo(15.979f, 17.099f)
            curveTo(14.946f, 16.108f, 13.544f, 15.5f, 12f, 15.5f)
            curveTo(10.456f, 15.5f, 9.055f, 16.108f, 8.022f, 17.098f)
            lineTo(8.23f, 18f)
            horizontalLineTo(15.77f)
            close()
            moveTo(12f, 14f)
            curveTo(10.365f, 14f, 8.856f, 14.541f, 7.643f, 15.455f)
            lineTo(7.588f, 15.216f)
            curveTo(7.577f, 15.169f, 7.552f, 15.125f, 7.517f, 15.092f)
            curveTo(5.686f, 13.344f, 4.75f, 11.387f, 4.75f, 9.251f)
            curveTo(4.75f, 5.247f, 7.996f, 2.001f, 12f, 2.001f)
            curveTo(16.004f, 2.001f, 19.25f, 5.247f, 19.25f, 9.251f)
            curveTo(19.25f, 11.387f, 18.314f, 13.344f, 16.485f, 15.092f)
            curveTo(16.449f, 15.125f, 16.425f, 15.169f, 16.414f, 15.216f)
            lineTo(16.358f, 15.456f)
            curveTo(15.145f, 14.542f, 13.636f, 14f, 12f, 14f)
            close()
            moveTo(10.25f, 9.25f)
            curveTo(10.25f, 8.283f, 11.033f, 7.5f, 12f, 7.5f)
            curveTo(12.967f, 7.5f, 13.75f, 8.283f, 13.75f, 9.25f)
            curveTo(13.75f, 10.217f, 12.967f, 11f, 12f, 11f)
            curveTo(11.033f, 11f, 10.25f, 10.217f, 10.25f, 9.25f)
            close()
            moveTo(12f, 6f)
            curveTo(10.205f, 6f, 8.75f, 7.455f, 8.75f, 9.25f)
            curveTo(8.75f, 11.045f, 10.205f, 12.5f, 12f, 12.5f)
            curveTo(13.795f, 12.5f, 15.25f, 11.045f, 15.25f, 9.25f)
            curveTo(15.25f, 7.455f, 13.795f, 6f, 12f, 6f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun LightbulbPersonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.LightbulbPerson, contentDescription = null)
    }
}
