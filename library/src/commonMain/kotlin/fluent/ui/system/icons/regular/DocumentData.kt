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
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.DocumentData: ImageVector
    get() {
        if (_DocumentData != null) {
            return _DocumentData!!
        }
        _DocumentData = ImageVector.Builder(
            name = "Regular.DocumentData",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(8.75f, 11f)
                curveTo(9.164f, 11f, 9.5f, 11.336f, 9.5f, 11.75f)
                verticalLineTo(18.25f)
                curveTo(9.5f, 18.664f, 9.164f, 19f, 8.75f, 19f)
                curveTo(8.336f, 19f, 8f, 18.664f, 8f, 18.25f)
                verticalLineTo(11.75f)
                curveTo(8f, 11.336f, 8.336f, 11f, 8.75f, 11f)
                close()
                moveTo(12.75f, 15.75f)
                curveTo(12.75f, 15.336f, 12.414f, 15f, 12f, 15f)
                curveTo(11.586f, 15f, 11.25f, 15.336f, 11.25f, 15.75f)
                lineTo(11.25f, 18.25f)
                curveTo(11.25f, 18.664f, 11.586f, 19f, 12f, 19f)
                curveTo(12.414f, 19f, 12.75f, 18.664f, 12.75f, 18.25f)
                verticalLineTo(15.75f)
                close()
                moveTo(15.25f, 13f)
                curveTo(15.664f, 13f, 16f, 13.336f, 16f, 13.75f)
                verticalLineTo(18.25f)
                curveTo(16f, 18.664f, 15.664f, 19f, 15.25f, 19f)
                curveTo(14.836f, 19f, 14.5f, 18.664f, 14.5f, 18.25f)
                verticalLineTo(13.75f)
                curveTo(14.5f, 13.336f, 14.836f, 13f, 15.25f, 13f)
                close()
                moveTo(12.483f, 2f)
                curveTo(12.814f, 2f, 13.132f, 2.132f, 13.367f, 2.366f)
                lineTo(16.22f, 5.22f)
                curveTo(16.229f, 5.228f, 16.237f, 5.236f, 16.245f, 5.245f)
                lineTo(19.414f, 8.414f)
                curveTo(19.789f, 8.789f, 20f, 9.298f, 20f, 9.828f)
                verticalLineTo(20f)
                curveTo(20f, 21.104f, 19.104f, 22f, 18f, 22f)
                horizontalLineTo(6f)
                curveTo(4.896f, 22f, 4f, 21.104f, 4f, 20f)
                verticalLineTo(4f)
                curveTo(4f, 2.896f, 4.896f, 2f, 6f, 2f)
                horizontalLineTo(12.483f)
                close()
                moveTo(6f, 3.5f)
                curveTo(5.724f, 3.5f, 5.5f, 3.725f, 5.5f, 4f)
                verticalLineTo(20f)
                curveTo(5.5f, 20.275f, 5.724f, 20.5f, 6f, 20.5f)
                horizontalLineTo(18f)
                curveTo(18.276f, 20.5f, 18.5f, 20.275f, 18.5f, 20f)
                verticalLineTo(10f)
                horizontalLineTo(14f)
                curveTo(12.896f, 10f, 12f, 9.104f, 12f, 8f)
                verticalLineTo(3.5f)
                horizontalLineTo(6f)
                close()
                moveTo(13.5f, 4.621f)
                verticalLineTo(8f)
                curveTo(13.5f, 8.275f, 13.724f, 8.5f, 14f, 8.5f)
                horizontalLineTo(17.378f)
                lineTo(13.5f, 4.621f)
                close()
            }
        }.build()

        return _DocumentData!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentData: ImageVector? = null

@Preview
@Composable
private fun DocumentDataPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DocumentData, contentDescription = null)
    }
}
