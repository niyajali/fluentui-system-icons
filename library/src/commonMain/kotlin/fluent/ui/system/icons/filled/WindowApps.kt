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

public val FluentUi.Filled.WindowApps: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.WindowApps",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineTo(9.009f)
            curveTo(20.917f, 9.003f, 20.834f, 9f, 20.75f, 9f)
            horizontalLineTo(19.5f)
            verticalLineTo(8.5f)
            horizontalLineTo(4.5f)
            verticalLineTo(17.75f)
            curveTo(4.5f, 18.716f, 5.284f, 19.5f, 6.25f, 19.5f)
            horizontalLineTo(9f)
            verticalLineTo(20.75f)
            curveTo(9f, 20.834f, 9.003f, 20.917f, 9.009f, 21f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(6.25f)
            close()
            moveTo(12.25f, 15.5f)
            horizontalLineTo(15.5f)
            verticalLineTo(12.25f)
            curveTo(15.5f, 11.007f, 16.507f, 10f, 17.75f, 10f)
            horizontalLineTo(20.75f)
            curveTo(21.993f, 10f, 23f, 11.007f, 23f, 12.25f)
            verticalLineTo(19.75f)
            curveTo(23f, 21.545f, 21.545f, 23f, 19.75f, 23f)
            horizontalLineTo(12.25f)
            curveTo(11.007f, 23f, 10f, 21.993f, 10f, 20.75f)
            verticalLineTo(17.75f)
            curveTo(10f, 16.507f, 11.007f, 15.5f, 12.25f, 15.5f)
            close()
            moveTo(17f, 12.25f)
            verticalLineTo(15.5f)
            horizontalLineTo(21.5f)
            verticalLineTo(12.25f)
            curveTo(21.5f, 11.836f, 21.164f, 11.5f, 20.75f, 11.5f)
            horizontalLineTo(17.75f)
            curveTo(17.336f, 11.5f, 17f, 11.836f, 17f, 12.25f)
            close()
            moveTo(15.5f, 21.5f)
            verticalLineTo(17f)
            horizontalLineTo(12.25f)
            curveTo(11.836f, 17f, 11.5f, 17.336f, 11.5f, 17.75f)
            verticalLineTo(20.75f)
            curveTo(11.5f, 21.164f, 11.836f, 21.5f, 12.25f, 21.5f)
            horizontalLineTo(15.5f)
            close()
            moveTo(17f, 17f)
            verticalLineTo(21.5f)
            horizontalLineTo(19.75f)
            curveTo(20.716f, 21.5f, 21.5f, 20.716f, 21.5f, 19.75f)
            verticalLineTo(17f)
            horizontalLineTo(17f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun WindowAppsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.WindowApps, contentDescription = null)
    }
}
