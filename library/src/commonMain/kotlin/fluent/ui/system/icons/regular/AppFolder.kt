/*
 * MIT License
 *
 * Copyright (c) 2020 Microsoft Corporation
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
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

public val FluentIcons.Regular.AppFolder: ImageVector
    get() {
        if (_AppFolder != null) {
            return _AppFolder!!
        }
        _AppFolder = ImageVector.Builder(
            name = "Regular.AppFolder",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11.502f, 14.25f)
                curveTo(11.502f, 13.283f, 10.719f, 12.5f, 9.752f, 12.5f)
                horizontalLineTo(7.752f)
                curveTo(6.786f, 12.5f, 6.002f, 13.283f, 6.002f, 14.25f)
                verticalLineTo(16.25f)
                curveTo(6.002f, 17.216f, 6.786f, 18f, 7.752f, 18f)
                horizontalLineTo(9.752f)
                curveTo(10.719f, 18f, 11.502f, 17.216f, 11.502f, 16.25f)
                verticalLineTo(14.25f)
                close()
                moveTo(7.752f, 14f)
                horizontalLineTo(9.752f)
                curveTo(9.89f, 14f, 10.002f, 14.112f, 10.002f, 14.25f)
                verticalLineTo(16.25f)
                curveTo(10.002f, 16.388f, 9.89f, 16.5f, 9.752f, 16.5f)
                horizontalLineTo(7.752f)
                curveTo(7.614f, 16.5f, 7.502f, 16.388f, 7.502f, 16.25f)
                verticalLineTo(14.25f)
                curveTo(7.502f, 14.112f, 7.614f, 14f, 7.752f, 14f)
                close()
                moveTo(18f, 14.25f)
                curveTo(18f, 13.283f, 17.216f, 12.5f, 16.25f, 12.5f)
                horizontalLineTo(14.25f)
                curveTo(13.283f, 12.5f, 12.5f, 13.283f, 12.5f, 14.25f)
                verticalLineTo(16.25f)
                curveTo(12.5f, 17.216f, 13.283f, 18f, 14.25f, 18f)
                horizontalLineTo(16.25f)
                curveTo(17.216f, 18f, 18f, 17.216f, 18f, 16.25f)
                verticalLineTo(14.25f)
                close()
                moveTo(14.25f, 14f)
                horizontalLineTo(16.25f)
                curveTo(16.388f, 14f, 16.5f, 14.112f, 16.5f, 14.25f)
                verticalLineTo(16.25f)
                curveTo(16.5f, 16.388f, 16.388f, 16.5f, 16.25f, 16.5f)
                horizontalLineTo(14.25f)
                curveTo(14.112f, 16.5f, 14f, 16.388f, 14f, 16.25f)
                verticalLineTo(14.25f)
                curveTo(14f, 14.112f, 14.112f, 14f, 14.25f, 14f)
                close()
                moveTo(11.501f, 7.75f)
                curveTo(11.501f, 6.784f, 10.717f, 6f, 9.751f, 6f)
                horizontalLineTo(7.751f)
                curveTo(6.784f, 6f, 6.001f, 6.784f, 6.001f, 7.75f)
                verticalLineTo(9.75f)
                curveTo(6.001f, 10.717f, 6.784f, 11.5f, 7.751f, 11.5f)
                horizontalLineTo(9.751f)
                curveTo(10.717f, 11.5f, 11.501f, 10.717f, 11.501f, 9.75f)
                verticalLineTo(7.75f)
                close()
                moveTo(7.751f, 7.5f)
                horizontalLineTo(9.751f)
                curveTo(9.889f, 7.5f, 10.001f, 7.612f, 10.001f, 7.75f)
                verticalLineTo(9.75f)
                curveTo(10.001f, 9.888f, 9.889f, 10f, 9.751f, 10f)
                horizontalLineTo(7.751f)
                curveTo(7.613f, 10f, 7.501f, 9.888f, 7.501f, 9.75f)
                verticalLineTo(7.75f)
                curveTo(7.501f, 7.612f, 7.613f, 7.5f, 7.751f, 7.5f)
                close()
                moveTo(17.998f, 7.75f)
                curveTo(17.998f, 6.784f, 17.215f, 6f, 16.248f, 6f)
                horizontalLineTo(14.248f)
                curveTo(13.282f, 6f, 12.498f, 6.784f, 12.498f, 7.75f)
                verticalLineTo(9.75f)
                curveTo(12.498f, 10.717f, 13.282f, 11.5f, 14.248f, 11.5f)
                horizontalLineTo(16.248f)
                curveTo(17.215f, 11.5f, 17.998f, 10.717f, 17.998f, 9.75f)
                verticalLineTo(7.75f)
                close()
                moveTo(14.248f, 7.5f)
                horizontalLineTo(16.248f)
                curveTo(16.386f, 7.5f, 16.498f, 7.612f, 16.498f, 7.75f)
                verticalLineTo(9.75f)
                curveTo(16.498f, 9.888f, 16.386f, 10f, 16.248f, 10f)
                horizontalLineTo(14.248f)
                curveTo(14.11f, 10f, 13.998f, 9.888f, 13.998f, 9.75f)
                verticalLineTo(7.75f)
                curveTo(13.998f, 7.612f, 14.11f, 7.5f, 14.248f, 7.5f)
                close()
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
                moveTo(4.5f, 6.25f)
                curveTo(4.5f, 5.284f, 5.284f, 4.5f, 6.25f, 4.5f)
                horizontalLineTo(17.75f)
                curveTo(18.716f, 4.5f, 19.5f, 5.284f, 19.5f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(19.5f, 18.716f, 18.716f, 19.5f, 17.75f, 19.5f)
                horizontalLineTo(6.25f)
                curveTo(5.284f, 19.5f, 4.5f, 18.716f, 4.5f, 17.75f)
                verticalLineTo(6.25f)
                close()
            }
        }.build()

        return _AppFolder!!
    }

@Suppress("ObjectPropertyName")
private var _AppFolder: ImageVector? = null

@Preview
@Composable
private fun AppFolderPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.AppFolder, contentDescription = null)
    }
}
