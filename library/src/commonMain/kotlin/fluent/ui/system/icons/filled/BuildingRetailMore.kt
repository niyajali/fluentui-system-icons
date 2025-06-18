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

public val FluentUi.Filled.BuildingRetailMore: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BuildingRetailMore",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.22f, 3f)
            curveTo(5.699f, 3f, 5.206f, 3.232f, 4.873f, 3.633f)
            lineTo(1.292f, 7.952f)
            curveTo(0.617f, 8.767f, 1.196f, 10f, 2.254f, 10f)
            horizontalLineTo(21.746f)
            curveTo(22.805f, 10f, 23.384f, 8.767f, 22.709f, 7.952f)
            lineTo(19.128f, 3.633f)
            curveTo(18.795f, 3.232f, 18.301f, 3f, 17.78f, 3f)
            horizontalLineTo(6.22f)
            close()
            moveTo(3f, 11.5f)
            verticalLineTo(18.75f)
            curveTo(3f, 20.131f, 4.119f, 21.25f, 5.5f, 21.25f)
            horizontalLineTo(18.5f)
            curveTo(19.881f, 21.25f, 21f, 20.131f, 21f, 18.75f)
            verticalLineTo(11.5f)
            horizontalLineTo(3f)
            close()
            moveTo(9f, 15.25f)
            curveTo(9f, 15.94f, 8.44f, 16.5f, 7.75f, 16.5f)
            curveTo(7.06f, 16.5f, 6.5f, 15.94f, 6.5f, 15.25f)
            curveTo(6.5f, 14.56f, 7.06f, 14f, 7.75f, 14f)
            curveTo(8.44f, 14f, 9f, 14.56f, 9f, 15.25f)
            close()
            moveTo(12f, 16.5f)
            curveTo(11.31f, 16.5f, 10.75f, 15.94f, 10.75f, 15.25f)
            curveTo(10.75f, 14.56f, 11.31f, 14f, 12f, 14f)
            curveTo(12.69f, 14f, 13.25f, 14.56f, 13.25f, 15.25f)
            curveTo(13.25f, 15.94f, 12.69f, 16.5f, 12f, 16.5f)
            close()
            moveTo(17.5f, 15.25f)
            curveTo(17.5f, 15.94f, 16.94f, 16.5f, 16.25f, 16.5f)
            curveTo(15.56f, 16.5f, 15f, 15.94f, 15f, 15.25f)
            curveTo(15f, 14.56f, 15.56f, 14f, 16.25f, 14f)
            curveTo(16.94f, 14f, 17.5f, 14.56f, 17.5f, 15.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BuildingRetailMorePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.BuildingRetailMore, contentDescription = null)
    }
}
