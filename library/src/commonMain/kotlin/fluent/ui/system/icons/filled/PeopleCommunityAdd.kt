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

public val FluentUi.Filled.PeopleCommunityAdd: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PeopleCommunityAdd",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8.75f, 6.25f)
            curveTo(8.75f, 4.455f, 10.205f, 3f, 12f, 3f)
            curveTo(13.795f, 3f, 15.25f, 4.455f, 15.25f, 6.25f)
            curveTo(15.25f, 8.045f, 13.795f, 9.5f, 12f, 9.5f)
            curveTo(10.205f, 9.5f, 8.75f, 8.045f, 8.75f, 6.25f)
            close()
            moveTo(5f, 5f)
            curveTo(3.343f, 5f, 2f, 6.343f, 2f, 8f)
            curveTo(2f, 9.657f, 3.343f, 11f, 5f, 11f)
            curveTo(6.657f, 11f, 8f, 9.657f, 8f, 8f)
            curveTo(8f, 6.343f, 6.657f, 5f, 5f, 5f)
            close()
            moveTo(19f, 5f)
            curveTo(17.343f, 5f, 16f, 6.343f, 16f, 8f)
            curveTo(16f, 9.657f, 17.343f, 11f, 19f, 11f)
            curveTo(20.657f, 11f, 22f, 9.657f, 22f, 8f)
            curveTo(22f, 6.343f, 20.657f, 5f, 19f, 5f)
            close()
            moveTo(9.25f, 11f)
            curveTo(8.283f, 11f, 7.5f, 11.783f, 7.5f, 12.75f)
            verticalLineTo(16.5f)
            curveTo(7.5f, 18.985f, 9.515f, 21f, 12f, 21f)
            lineTo(12.022f, 21f)
            curveTo(11.375f, 19.99f, 11f, 18.789f, 11f, 17.5f)
            curveTo(11f, 14.545f, 12.971f, 12.051f, 15.67f, 11.261f)
            curveTo(15.403f, 11.096f, 15.088f, 11f, 14.75f, 11f)
            horizontalLineTo(9.25f)
            close()
            moveTo(6.61f, 11.978f)
            curveTo(6.538f, 12.223f, 6.5f, 12.482f, 6.5f, 12.75f)
            verticalLineTo(16.5f)
            curveTo(6.5f, 18.224f, 7.293f, 19.763f, 8.535f, 20.771f)
            curveTo(8.452f, 20.799f, 8.368f, 20.824f, 8.283f, 20.847f)
            curveTo(5.883f, 21.49f, 3.415f, 20.065f, 2.772f, 17.665f)
            lineTo(2.06f, 15.009f)
            curveTo(1.81f, 14.075f, 2.364f, 13.115f, 3.297f, 12.865f)
            lineTo(6.61f, 11.978f)
            close()
            moveTo(23f, 17.5f)
            curveTo(23f, 14.462f, 20.538f, 12f, 17.5f, 12f)
            curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
            curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
            curveTo(20.538f, 23f, 23f, 20.538f, 23f, 17.5f)
            close()
            moveTo(18.001f, 18f)
            lineTo(18.001f, 20.503f)
            curveTo(18.001f, 20.78f, 17.777f, 21.003f, 17.501f, 21.003f)
            curveTo(17.225f, 21.003f, 17.001f, 20.78f, 17.001f, 20.503f)
            lineTo(17.001f, 18f)
            horizontalLineTo(14.496f)
            curveTo(14.22f, 18f, 13.996f, 17.776f, 13.996f, 17.5f)
            curveTo(13.996f, 17.224f, 14.22f, 17f, 14.496f, 17f)
            horizontalLineTo(17f)
            lineTo(17f, 14.499f)
            curveTo(17f, 14.223f, 17.224f, 13.999f, 17.5f, 13.999f)
            curveTo(17.776f, 13.999f, 18f, 14.223f, 18f, 14.499f)
            lineTo(18f, 17f)
            horizontalLineTo(20.497f)
            curveTo(20.772f, 17f, 20.996f, 17.224f, 20.996f, 17.5f)
            curveTo(20.996f, 17.776f, 20.772f, 18f, 20.497f, 18f)
            horizontalLineTo(18.001f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PeopleCommunityAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.PeopleCommunityAdd, contentDescription = null)
    }
}
