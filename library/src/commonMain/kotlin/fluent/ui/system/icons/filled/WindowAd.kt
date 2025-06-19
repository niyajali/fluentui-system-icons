package fluent.ui.system.icons.filled

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

public val FluentIcons.Filled.WindowAd: ImageVector
    get() {
        if (_WindowAd != null) {
            return _WindowAd!!
        }
        _WindowAd = ImageVector.Builder(
            name = "Filled.WindowAd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.25f, 3f)
                curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 21f, 21f, 19.545f, 21f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
                horizontalLineTo(6.25f)
                close()
                moveTo(6.25f, 19.5f)
                curveTo(5.284f, 19.5f, 4.5f, 18.716f, 4.5f, 17.75f)
                verticalLineTo(8.5f)
                horizontalLineTo(19.5f)
                verticalLineTo(17.75f)
                curveTo(19.5f, 18.716f, 18.716f, 19.5f, 17.75f, 19.5f)
                horizontalLineTo(6.25f)
                close()
                moveTo(6.75f, 10f)
                curveTo(6.336f, 10f, 6f, 10.336f, 6f, 10.75f)
                verticalLineTo(15.75f)
                curveTo(6f, 16.164f, 6.336f, 16.5f, 6.75f, 16.5f)
                horizontalLineTo(11.75f)
                curveTo(12.164f, 16.5f, 12.5f, 16.164f, 12.5f, 15.75f)
                verticalLineTo(10.75f)
                curveTo(12.5f, 10.336f, 12.164f, 10f, 11.75f, 10f)
                horizontalLineTo(6.75f)
                close()
                moveTo(7.5f, 15f)
                verticalLineTo(11.5f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                horizontalLineTo(7.5f)
                close()
            }
        }.build()

        return _WindowAd!!
    }

@Suppress("ObjectPropertyName")
private var _WindowAd: ImageVector? = null

@Preview
@Composable
private fun WindowAdPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.WindowAd, contentDescription = null)
    }
}
