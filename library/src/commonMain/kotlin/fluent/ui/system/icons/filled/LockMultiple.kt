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

public val FluentIcons.Filled.LockMultiple: ImageVector
    get() {
        if (_LockMultiple != null) {
            return _LockMultiple!!
        }
        _LockMultiple = ImageVector.Builder(
            name = "Filled.LockMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(7.25f, 5.5f)
                curveTo(7.25f, 3.567f, 8.817f, 2f, 10.75f, 2f)
                curveTo(12.683f, 2f, 14.25f, 3.567f, 14.25f, 5.5f)
                verticalLineTo(6.5f)
                horizontalLineTo(15.25f)
                curveTo(16.493f, 6.5f, 17.5f, 7.507f, 17.5f, 8.75f)
                verticalLineTo(16.25f)
                curveTo(17.5f, 17.493f, 16.493f, 18.5f, 15.25f, 18.5f)
                horizontalLineTo(6.25f)
                curveTo(5.007f, 18.5f, 4f, 17.493f, 4f, 16.25f)
                verticalLineTo(8.75f)
                curveTo(4f, 7.507f, 5.007f, 6.5f, 6.25f, 6.5f)
                horizontalLineTo(7.25f)
                verticalLineTo(5.5f)
                close()
                moveTo(12.75f, 5.5f)
                curveTo(12.75f, 4.395f, 11.855f, 3.5f, 10.75f, 3.5f)
                curveTo(9.645f, 3.5f, 8.75f, 4.395f, 8.75f, 5.5f)
                verticalLineTo(6.5f)
                horizontalLineTo(12.75f)
                verticalLineTo(5.5f)
                close()
                moveTo(10.75f, 13.75f)
                curveTo(11.44f, 13.75f, 12f, 13.19f, 12f, 12.5f)
                curveTo(12f, 11.81f, 11.44f, 11.25f, 10.75f, 11.25f)
                curveTo(10.06f, 11.25f, 9.5f, 11.81f, 9.5f, 12.5f)
                curveTo(9.5f, 13.19f, 10.06f, 13.75f, 10.75f, 13.75f)
                close()
                moveTo(7.628f, 19.5f)
                curveTo(7.937f, 20.374f, 8.77f, 21f, 9.75f, 21f)
                horizontalLineTo(15.75f)
                curveTo(18.097f, 21f, 20f, 19.097f, 20f, 16.75f)
                verticalLineTo(12.25f)
                curveTo(20f, 11.27f, 19.374f, 10.437f, 18.5f, 10.128f)
                verticalLineTo(16.75f)
                curveTo(18.5f, 18.269f, 17.269f, 19.5f, 15.75f, 19.5f)
                horizontalLineTo(7.628f)
                close()
            }
        }.build()

        return _LockMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _LockMultiple: ImageVector? = null

@Preview
@Composable
private fun LockMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.LockMultiple, contentDescription = null)
    }
}
