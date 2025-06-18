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

public val FluentUi.Regular.DocumentDataLock: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DocumentDataLock",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(18.5f, 20f)
            curveTo(18.5f, 20.275f, 18.276f, 20.5f, 18f, 20.5f)
            horizontalLineTo(12f)
            verticalLineTo(21.5f)
            curveTo(12f, 21.671f, 11.983f, 21.838f, 11.95f, 22f)
            horizontalLineTo(18f)
            curveTo(19.104f, 22f, 20f, 21.104f, 20f, 20f)
            verticalLineTo(9.828f)
            curveTo(20f, 9.298f, 19.789f, 8.789f, 19.414f, 8.414f)
            lineTo(16.245f, 5.245f)
            curveTo(16.237f, 5.236f, 16.229f, 5.228f, 16.22f, 5.22f)
            lineTo(13.367f, 2.366f)
            curveTo(13.132f, 2.132f, 12.814f, 2f, 12.483f, 2f)
            horizontalLineTo(6f)
            curveTo(4.896f, 2f, 4f, 2.896f, 4f, 4f)
            verticalLineTo(11.55f)
            curveTo(4.41f, 11.132f, 4.924f, 10.816f, 5.5f, 10.645f)
            verticalLineTo(4f)
            curveTo(5.5f, 3.725f, 5.724f, 3.5f, 6f, 3.5f)
            horizontalLineTo(12f)
            verticalLineTo(8f)
            curveTo(12f, 9.104f, 12.896f, 10f, 14f, 10f)
            horizontalLineTo(18.5f)
            verticalLineTo(20f)
            close()
            moveTo(13.5f, 4.621f)
            lineTo(17.378f, 8.5f)
            horizontalLineTo(14f)
            curveTo(13.724f, 8.5f, 13.5f, 8.275f, 13.5f, 8f)
            verticalLineTo(4.621f)
            close()
            moveTo(6.5f, 11.5f)
            curveTo(5.119f, 11.5f, 4f, 12.619f, 4f, 14f)
            verticalLineTo(15f)
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
            moveTo(13.25f, 15f)
            curveTo(13.664f, 15f, 14f, 15.336f, 14f, 15.75f)
            verticalLineTo(18.25f)
            curveTo(14f, 18.664f, 13.664f, 19f, 13.25f, 19f)
            curveTo(12.836f, 19f, 12.5f, 18.664f, 12.5f, 18.25f)
            verticalLineTo(15.75f)
            curveTo(12.5f, 15.336f, 12.836f, 15f, 13.25f, 15f)
            close()
            moveTo(17f, 13.75f)
            curveTo(17f, 13.336f, 16.664f, 13f, 16.25f, 13f)
            curveTo(15.836f, 13f, 15.5f, 13.336f, 15.5f, 13.75f)
            verticalLineTo(18.25f)
            curveTo(15.5f, 18.664f, 15.836f, 19f, 16.25f, 19f)
            curveTo(16.664f, 19f, 17f, 18.664f, 17f, 18.25f)
            verticalLineTo(13.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentDataLockPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.DocumentDataLock, contentDescription = null)
    }
}
