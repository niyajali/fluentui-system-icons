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

public val FluentIcons.Regular.NumberCircle1: ImageVector
    get() {
        if (_NumberCircle1 != null) {
            return _NumberCircle1!!
        }
        _NumberCircle1 = ImageVector.Builder(
            name = "Regular.NumberCircle1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(13.5f, 7.25f)
                curveTo(13.5f, 6.864f, 13.208f, 6.542f, 12.824f, 6.504f)
                curveTo(12.44f, 6.466f, 12.09f, 6.725f, 12.015f, 7.103f)
                curveTo(11.919f, 7.581f, 11.611f, 8.223f, 11.136f, 8.809f)
                curveTo(10.662f, 9.395f, 10.085f, 9.848f, 9.513f, 10.038f)
                curveTo(9.12f, 10.17f, 8.908f, 10.594f, 9.039f, 10.987f)
                curveTo(9.17f, 11.38f, 9.594f, 11.592f, 9.987f, 11.462f)
                curveTo(10.766f, 11.202f, 11.452f, 10.688f, 12f, 10.1f)
                verticalLineTo(16.25f)
                curveTo(12f, 16.664f, 12.336f, 17f, 12.75f, 17f)
                curveTo(13.164f, 17f, 13.5f, 16.664f, 13.5f, 16.25f)
                verticalLineTo(7.25f)
                close()
                moveTo(12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                close()
                moveTo(3.5f, 12f)
                curveTo(3.5f, 7.306f, 7.306f, 3.5f, 12f, 3.5f)
                curveTo(16.694f, 3.5f, 20.5f, 7.306f, 20.5f, 12f)
                curveTo(20.5f, 16.694f, 16.694f, 20.5f, 12f, 20.5f)
                curveTo(7.306f, 20.5f, 3.5f, 16.694f, 3.5f, 12f)
                close()
            }
        }.build()

        return _NumberCircle1!!
    }

@Suppress("ObjectPropertyName")
private var _NumberCircle1: ImageVector? = null

@Preview
@Composable
private fun NumberCircle1Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.NumberCircle1, contentDescription = null)
    }
}
