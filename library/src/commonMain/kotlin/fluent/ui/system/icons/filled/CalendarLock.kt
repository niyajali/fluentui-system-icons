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

public val FluentUi.Filled.CalendarLock: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalendarLock",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21f, 8.5f)
            verticalLineTo(11.55f)
            curveTo(20.365f, 10.902f, 19.479f, 10.5f, 18.5f, 10.5f)
            curveTo(16.567f, 10.5f, 15f, 12.067f, 15f, 14f)
            verticalLineTo(14.05f)
            curveTo(13.859f, 14.282f, 13f, 15.29f, 13f, 16.5f)
            verticalLineTo(21f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(8.5f)
            horizontalLineTo(21f)
            close()
            moveTo(17.75f, 3f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineTo(7f)
            horizontalLineTo(3f)
            verticalLineTo(6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineTo(17.75f)
            close()
            moveTo(16f, 15f)
            horizontalLineTo(15.5f)
            curveTo(14.672f, 15f, 14f, 15.672f, 14f, 16.5f)
            verticalLineTo(21.5f)
            curveTo(14f, 22.328f, 14.672f, 23f, 15.5f, 23f)
            horizontalLineTo(21.5f)
            curveTo(22.328f, 23f, 23f, 22.328f, 23f, 21.5f)
            verticalLineTo(16.5f)
            curveTo(23f, 15.672f, 22.328f, 15f, 21.5f, 15f)
            horizontalLineTo(21f)
            verticalLineTo(14f)
            curveTo(21f, 12.619f, 19.881f, 11.5f, 18.5f, 11.5f)
            curveTo(17.119f, 11.5f, 16f, 12.619f, 16f, 14f)
            verticalLineTo(15f)
            close()
            moveTo(17.5f, 14f)
            curveTo(17.5f, 13.448f, 17.948f, 13f, 18.5f, 13f)
            curveTo(19.052f, 13f, 19.5f, 13.448f, 19.5f, 14f)
            verticalLineTo(15f)
            horizontalLineTo(17.5f)
            verticalLineTo(14f)
            close()
            moveTo(19.5f, 19f)
            curveTo(19.5f, 19.552f, 19.052f, 20f, 18.5f, 20f)
            curveTo(17.948f, 20f, 17.5f, 19.552f, 17.5f, 19f)
            curveTo(17.5f, 18.448f, 17.948f, 18f, 18.5f, 18f)
            curveTo(19.052f, 18f, 19.5f, 18.448f, 19.5f, 19f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CalendarLockPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.CalendarLock, contentDescription = null)
    }
}
