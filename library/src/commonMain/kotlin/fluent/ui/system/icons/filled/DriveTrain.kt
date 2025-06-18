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

public val FluentUi.Filled.DriveTrain: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DriveTrain",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 5.5f)
            curveTo(3f, 4.119f, 4.119f, 3f, 5.5f, 3f)
            curveTo(6.881f, 3f, 8f, 4.119f, 8f, 5.5f)
            verticalLineTo(6.5f)
            horizontalLineTo(10.063f)
            curveTo(10.285f, 5.637f, 11.068f, 5f, 12f, 5f)
            curveTo(12.932f, 5f, 13.715f, 5.637f, 13.937f, 6.5f)
            horizontalLineTo(16f)
            verticalLineTo(5.5f)
            curveTo(16f, 4.119f, 17.119f, 3f, 18.5f, 3f)
            curveTo(19.881f, 3f, 21f, 4.119f, 21f, 5.5f)
            verticalLineTo(8.5f)
            curveTo(21f, 9.881f, 19.881f, 11f, 18.5f, 11f)
            curveTo(17.119f, 11f, 16f, 9.881f, 16f, 8.5f)
            verticalLineTo(8f)
            horizontalLineTo(13.732f)
            curveTo(13.51f, 8.384f, 13.165f, 8.687f, 12.75f, 8.855f)
            verticalLineTo(15.145f)
            curveTo(13.165f, 15.313f, 13.51f, 15.616f, 13.732f, 16f)
            horizontalLineTo(16f)
            verticalLineTo(15.5f)
            curveTo(16f, 14.119f, 17.119f, 13f, 18.5f, 13f)
            curveTo(19.881f, 13f, 21f, 14.119f, 21f, 15.5f)
            verticalLineTo(18.5f)
            curveTo(21f, 19.881f, 19.881f, 21f, 18.5f, 21f)
            curveTo(17.119f, 21f, 16f, 19.881f, 16f, 18.5f)
            verticalLineTo(17.5f)
            horizontalLineTo(13.937f)
            curveTo(13.715f, 18.363f, 12.932f, 19f, 12f, 19f)
            curveTo(11.068f, 19f, 10.285f, 18.363f, 10.063f, 17.5f)
            horizontalLineTo(8f)
            verticalLineTo(18.5f)
            curveTo(8f, 19.881f, 6.881f, 21f, 5.5f, 21f)
            curveTo(4.119f, 21f, 3f, 19.881f, 3f, 18.5f)
            verticalLineTo(15.5f)
            curveTo(3f, 14.119f, 4.119f, 13f, 5.5f, 13f)
            curveTo(6.881f, 13f, 8f, 14.119f, 8f, 15.5f)
            verticalLineTo(16f)
            horizontalLineTo(10.268f)
            curveTo(10.49f, 15.616f, 10.835f, 15.313f, 11.25f, 15.145f)
            verticalLineTo(8.855f)
            curveTo(10.835f, 8.687f, 10.49f, 8.384f, 10.268f, 8f)
            horizontalLineTo(8f)
            verticalLineTo(8.5f)
            curveTo(8f, 9.881f, 6.881f, 11f, 5.5f, 11f)
            curveTo(4.119f, 11f, 3f, 9.881f, 3f, 8.5f)
            verticalLineTo(5.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DriveTrainPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DriveTrain, contentDescription = null)
    }
}
