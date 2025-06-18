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

public val FluentUi.Filled.DocumentLock: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentLock",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 2f)
            verticalLineTo(8f)
            curveTo(12f, 9.105f, 12.895f, 10f, 14f, 10f)
            horizontalLineTo(20f)
            verticalLineTo(20f)
            curveTo(20f, 21.105f, 19.105f, 22f, 18f, 22f)
            horizontalLineTo(11.95f)
            curveTo(11.983f, 21.838f, 12f, 21.671f, 12f, 21.5f)
            verticalLineTo(16.5f)
            curveTo(12f, 15.29f, 11.141f, 14.282f, 10f, 14.05f)
            verticalLineTo(14f)
            curveTo(10f, 12.067f, 8.433f, 10.5f, 6.5f, 10.5f)
            curveTo(5.521f, 10.5f, 4.635f, 10.902f, 4f, 11.55f)
            verticalLineTo(4f)
            curveTo(4f, 2.895f, 4.895f, 2f, 6f, 2f)
            horizontalLineTo(12f)
            close()
            moveTo(13.5f, 2.5f)
            verticalLineTo(8f)
            curveTo(13.5f, 8.276f, 13.724f, 8.5f, 14f, 8.5f)
            horizontalLineTo(19.5f)
            lineTo(13.5f, 2.5f)
            close()
            moveTo(4f, 15f)
            horizontalLineTo(3.5f)
            curveTo(2.672f, 15f, 2f, 15.672f, 2f, 16.5f)
            verticalLineTo(21.5f)
            curveTo(2f, 22.328f, 2.672f, 23f, 3.5f, 23f)
            horizontalLineTo(9.5f)
            curveTo(10.328f, 23f, 11f, 22.328f, 11f, 21.5f)
            verticalLineTo(16.5f)
            curveTo(11f, 15.672f, 10.328f, 15f, 9.5f, 15f)
            horizontalLineTo(9f)
            verticalLineTo(14f)
            curveTo(9f, 12.619f, 7.881f, 11.5f, 6.5f, 11.5f)
            curveTo(5.119f, 11.5f, 4f, 12.619f, 4f, 14f)
            verticalLineTo(15f)
            close()
            moveTo(5.5f, 14f)
            curveTo(5.5f, 13.448f, 5.948f, 13f, 6.5f, 13f)
            curveTo(7.052f, 13f, 7.5f, 13.448f, 7.5f, 14f)
            verticalLineTo(15f)
            horizontalLineTo(5.5f)
            verticalLineTo(14f)
            close()
            moveTo(7.5f, 19f)
            curveTo(7.5f, 19.552f, 7.052f, 20f, 6.5f, 20f)
            curveTo(5.948f, 20f, 5.5f, 19.552f, 5.5f, 19f)
            curveTo(5.5f, 18.448f, 5.948f, 18f, 6.5f, 18f)
            curveTo(7.052f, 18f, 7.5f, 18.448f, 7.5f, 19f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentLockPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DocumentLock, contentDescription = null)
    }
}
