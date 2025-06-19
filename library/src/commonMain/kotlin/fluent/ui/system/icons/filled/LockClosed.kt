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

public val FluentIcons.Filled.LockClosed: ImageVector
    get() {
        if (_LockClosed != null) {
            return _LockClosed!!
        }
        _LockClosed = ImageVector.Builder(
            name = "Filled.LockClosed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(16f, 6f)
                verticalLineTo(7f)
                horizontalLineTo(16.75f)
                curveTo(18.545f, 7f, 20f, 8.455f, 20f, 10.25f)
                verticalLineTo(17.75f)
                curveTo(20f, 19.545f, 18.545f, 21f, 16.75f, 21f)
                horizontalLineTo(7.25f)
                curveTo(5.455f, 21f, 4f, 19.545f, 4f, 17.75f)
                verticalLineTo(10.25f)
                curveTo(4f, 8.455f, 5.455f, 7f, 7.25f, 7f)
                horizontalLineTo(8f)
                verticalLineTo(6f)
                curveTo(8f, 3.791f, 9.791f, 2f, 12f, 2f)
                curveTo(14.209f, 2f, 16f, 3.791f, 16f, 6f)
                close()
                moveTo(9.5f, 6f)
                verticalLineTo(7f)
                horizontalLineTo(14.5f)
                verticalLineTo(6f)
                curveTo(14.5f, 4.619f, 13.381f, 3.5f, 12f, 3.5f)
                curveTo(10.619f, 3.5f, 9.5f, 4.619f, 9.5f, 6f)
                close()
                moveTo(12f, 15.5f)
                curveTo(12.828f, 15.5f, 13.5f, 14.828f, 13.5f, 14f)
                curveTo(13.5f, 13.172f, 12.828f, 12.5f, 12f, 12.5f)
                curveTo(11.172f, 12.5f, 10.5f, 13.172f, 10.5f, 14f)
                curveTo(10.5f, 14.828f, 11.172f, 15.5f, 12f, 15.5f)
                close()
            }
        }.build()

        return _LockClosed!!
    }

@Suppress("ObjectPropertyName")
private var _LockClosed: ImageVector? = null

@Preview
@Composable
private fun LockClosedPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.LockClosed, contentDescription = null)
    }
}
