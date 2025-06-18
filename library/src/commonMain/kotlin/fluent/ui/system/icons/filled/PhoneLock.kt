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

public val FluentUi.Filled.PhoneLock: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PhoneLock",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.75f, 2f)
            curveTo(14.993f, 2f, 16f, 3.007f, 16f, 4.25f)
            verticalLineTo(10.837f)
            curveTo(14.818f, 11.399f, 14f, 12.604f, 14f, 14f)
            verticalLineTo(14.05f)
            curveTo(12.859f, 14.282f, 12f, 15.29f, 12f, 16.5f)
            verticalLineTo(18.75f)
            curveTo(12f, 18.336f, 11.664f, 18f, 11.25f, 18f)
            horizontalLineTo(8.75f)
            curveTo(8.336f, 18f, 8f, 18.336f, 8f, 18.75f)
            curveTo(8f, 19.164f, 8.336f, 19.5f, 8.75f, 19.5f)
            horizontalLineTo(11.25f)
            curveTo(11.664f, 19.5f, 12f, 19.164f, 12f, 18.75f)
            verticalLineTo(21.5f)
            curveTo(12f, 21.671f, 12.017f, 21.838f, 12.05f, 22f)
            horizontalLineTo(6.25f)
            curveTo(5.007f, 22f, 4f, 20.993f, 4f, 19.75f)
            verticalLineTo(4.25f)
            curveTo(4f, 3.007f, 5.007f, 2f, 6.25f, 2f)
            horizontalLineTo(13.75f)
            close()
            moveTo(15f, 14f)
            verticalLineTo(15f)
            horizontalLineTo(14.5f)
            curveTo(13.672f, 15f, 13f, 15.672f, 13f, 16.5f)
            verticalLineTo(21.5f)
            curveTo(13f, 21.675f, 13.03f, 21.844f, 13.085f, 22f)
            curveTo(13.291f, 22.583f, 13.847f, 23f, 14.5f, 23f)
            horizontalLineTo(20.5f)
            curveTo(21.328f, 23f, 22f, 22.328f, 22f, 21.5f)
            verticalLineTo(16.5f)
            curveTo(22f, 15.672f, 21.328f, 15f, 20.5f, 15f)
            horizontalLineTo(20f)
            verticalLineTo(14f)
            curveTo(20f, 12.619f, 18.881f, 11.5f, 17.5f, 11.5f)
            curveTo(16.937f, 11.5f, 16.418f, 11.686f, 16f, 12f)
            curveTo(15.393f, 12.456f, 15f, 13.182f, 15f, 14f)
            close()
            moveTo(16.5f, 14f)
            curveTo(16.5f, 13.448f, 16.948f, 13f, 17.5f, 13f)
            curveTo(18.052f, 13f, 18.5f, 13.448f, 18.5f, 14f)
            verticalLineTo(15f)
            horizontalLineTo(16.5f)
            verticalLineTo(14f)
            close()
            moveTo(18.5f, 19f)
            curveTo(18.5f, 19.552f, 18.052f, 20f, 17.5f, 20f)
            curveTo(16.948f, 20f, 16.5f, 19.552f, 16.5f, 19f)
            curveTo(16.5f, 18.448f, 16.948f, 18f, 17.5f, 18f)
            curveTo(18.052f, 18f, 18.5f, 18.448f, 18.5f, 19f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PhoneLockPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.PhoneLock, contentDescription = null)
    }
}
