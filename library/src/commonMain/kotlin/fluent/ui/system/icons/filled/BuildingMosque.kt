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

public val FluentUi.Filled.BuildingMosque: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BuildingMosque",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2.75f, 6f)
            curveTo(3.302f, 6f, 3.75f, 5.552f, 3.75f, 5f)
            curveTo(3.75f, 4.448f, 3.302f, 4f, 2.75f, 4f)
            curveTo(2.198f, 4f, 1.75f, 4.448f, 1.75f, 5f)
            curveTo(1.75f, 5.552f, 2.198f, 6f, 2.75f, 6f)
            close()
            moveTo(21.25f, 6f)
            curveTo(21.802f, 6f, 22.25f, 5.552f, 22.25f, 5f)
            curveTo(22.25f, 4.448f, 21.802f, 4f, 21.25f, 4f)
            curveTo(20.698f, 4f, 20.25f, 4.448f, 20.25f, 5f)
            curveTo(20.25f, 5.552f, 20.698f, 6f, 21.25f, 6f)
            close()
            moveTo(2.75f, 7f)
            curveTo(3.164f, 7f, 3.5f, 7.336f, 3.5f, 7.75f)
            verticalLineTo(13f)
            horizontalLineTo(5.998f)
            curveTo(5.677f, 12.23f, 5.5f, 11.386f, 5.5f, 10.5f)
            curveTo(5.5f, 9.476f, 5.962f, 8.56f, 6.558f, 7.799f)
            curveTo(7.157f, 7.035f, 7.936f, 6.369f, 8.685f, 5.827f)
            curveTo(9.439f, 5.281f, 10.187f, 4.843f, 10.745f, 4.542f)
            curveTo(11.025f, 4.391f, 11.259f, 4.273f, 11.425f, 4.193f)
            curveTo(11.507f, 4.152f, 11.573f, 4.121f, 11.619f, 4.1f)
            lineTo(11.672f, 4.075f)
            lineTo(11.687f, 4.068f)
            lineTo(11.691f, 4.067f)
            lineTo(11.693f, 4.065f)
            curveTo(11.889f, 3.978f, 12.112f, 3.979f, 12.307f, 4.066f)
            lineTo(12.309f, 4.067f)
            lineTo(12.313f, 4.068f)
            lineTo(12.328f, 4.075f)
            lineTo(12.381f, 4.1f)
            curveTo(12.427f, 4.121f, 12.493f, 4.152f, 12.575f, 4.193f)
            curveTo(12.741f, 4.273f, 12.975f, 4.391f, 13.255f, 4.542f)
            curveTo(13.813f, 4.843f, 14.561f, 5.281f, 15.315f, 5.827f)
            curveTo(16.064f, 6.369f, 16.843f, 7.035f, 17.442f, 7.799f)
            curveTo(18.038f, 8.56f, 18.5f, 9.476f, 18.5f, 10.5f)
            curveTo(18.5f, 11.386f, 18.323f, 12.23f, 18.002f, 13f)
            horizontalLineTo(20.5f)
            verticalLineTo(7.75f)
            curveTo(20.5f, 7.336f, 20.836f, 7f, 21.25f, 7f)
            curveTo(21.664f, 7f, 22f, 7.336f, 22f, 7.75f)
            verticalLineTo(20.75f)
            curveTo(22f, 21.44f, 21.44f, 22f, 20.75f, 22f)
            horizontalLineTo(15.25f)
            curveTo(14.56f, 22f, 14f, 21.44f, 14f, 20.75f)
            verticalLineTo(19f)
            curveTo(14f, 17.895f, 13.105f, 17f, 12f, 17f)
            curveTo(10.895f, 17f, 10f, 17.895f, 10f, 19f)
            verticalLineTo(20.75f)
            curveTo(10f, 21.44f, 9.44f, 22f, 8.75f, 22f)
            horizontalLineTo(3.25f)
            curveTo(2.56f, 22f, 2f, 21.44f, 2f, 20.75f)
            verticalLineTo(7.75f)
            curveTo(2f, 7.336f, 2.336f, 7f, 2.75f, 7f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BuildingMosquePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.BuildingMosque, contentDescription = null)
    }
}
