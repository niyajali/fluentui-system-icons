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

public val FluentUi.Regular.PlantRagweed: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PlantRagweed",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9f, 5f)
            curveTo(9f, 3.343f, 10.343f, 2f, 12f, 2f)
            curveTo(13.657f, 2f, 15f, 3.343f, 15f, 5f)
            curveTo(15f, 5.184f, 14.983f, 5.365f, 14.951f, 5.541f)
            curveTo(16.117f, 5.753f, 17f, 6.773f, 17f, 8f)
            curveTo(17f, 8.681f, 16.727f, 9.299f, 16.285f, 9.75f)
            curveTo(16.727f, 10.201f, 17f, 10.819f, 17f, 11.5f)
            curveTo(17f, 12.881f, 15.881f, 14f, 14.5f, 14f)
            horizontalLineTo(12.75f)
            verticalLineTo(18.689f)
            lineTo(16.22f, 15.22f)
            curveTo(16.513f, 14.927f, 16.987f, 14.927f, 17.28f, 15.22f)
            curveTo(17.573f, 15.513f, 17.573f, 15.987f, 17.28f, 16.28f)
            lineTo(12.75f, 20.811f)
            verticalLineTo(22.25f)
            curveTo(12.75f, 22.664f, 12.414f, 23f, 12f, 23f)
            curveTo(11.586f, 23f, 11.25f, 22.664f, 11.25f, 22.25f)
            verticalLineTo(20.811f)
            lineTo(6.72f, 16.28f)
            curveTo(6.427f, 15.987f, 6.427f, 15.513f, 6.72f, 15.22f)
            curveTo(7.013f, 14.927f, 7.487f, 14.927f, 7.78f, 15.22f)
            lineTo(11.25f, 18.689f)
            verticalLineTo(14f)
            horizontalLineTo(9.5f)
            curveTo(8.119f, 14f, 7f, 12.881f, 7f, 11.5f)
            curveTo(7f, 10.819f, 7.273f, 10.201f, 7.715f, 9.75f)
            curveTo(7.273f, 9.299f, 7f, 8.681f, 7f, 8f)
            curveTo(7f, 6.773f, 7.883f, 5.753f, 9.049f, 5.541f)
            curveTo(9.017f, 5.365f, 9f, 5.184f, 9f, 5f)
            close()
            moveTo(9.5f, 9f)
            curveTo(9.914f, 9f, 10.25f, 9.336f, 10.25f, 9.75f)
            curveTo(10.25f, 10.164f, 9.914f, 10.5f, 9.5f, 10.5f)
            curveTo(8.948f, 10.5f, 8.5f, 10.948f, 8.5f, 11.5f)
            curveTo(8.5f, 12.052f, 8.948f, 12.5f, 9.5f, 12.5f)
            horizontalLineTo(14.5f)
            curveTo(15.052f, 12.5f, 15.5f, 12.052f, 15.5f, 11.5f)
            curveTo(15.5f, 10.948f, 15.052f, 10.5f, 14.5f, 10.5f)
            curveTo(14.086f, 10.5f, 13.75f, 10.164f, 13.75f, 9.75f)
            curveTo(13.75f, 9.336f, 14.086f, 9f, 14.5f, 9f)
            curveTo(15.052f, 9f, 15.5f, 8.552f, 15.5f, 8f)
            curveTo(15.5f, 7.448f, 15.052f, 7f, 14.5f, 7f)
            horizontalLineTo(13.871f)
            curveTo(13.594f, 7f, 13.34f, 6.847f, 13.21f, 6.603f)
            curveTo(13.079f, 6.359f, 13.094f, 6.063f, 13.248f, 5.833f)
            curveTo(13.407f, 5.595f, 13.5f, 5.309f, 13.5f, 5f)
            curveTo(13.5f, 4.172f, 12.828f, 3.5f, 12f, 3.5f)
            curveTo(11.172f, 3.5f, 10.5f, 4.172f, 10.5f, 5f)
            curveTo(10.5f, 5.309f, 10.593f, 5.595f, 10.752f, 5.833f)
            curveTo(10.906f, 6.063f, 10.921f, 6.359f, 10.79f, 6.603f)
            curveTo(10.66f, 6.847f, 10.406f, 7f, 10.129f, 7f)
            horizontalLineTo(9.5f)
            curveTo(8.948f, 7f, 8.5f, 7.448f, 8.5f, 8f)
            curveTo(8.5f, 8.552f, 8.948f, 9f, 9.5f, 9f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PlantRagweedPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.PlantRagweed, contentDescription = null)
    }
}
