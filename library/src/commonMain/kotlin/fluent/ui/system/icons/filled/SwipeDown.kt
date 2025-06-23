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

public val FluentIcons.Filled.SwipeDown: ImageVector
    get() {
        if (_SwipeDown != null) {
            return _SwipeDown!!
        }
        _SwipeDown = ImageVector.Builder(
            name = "Filled.SwipeDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 6f)
                curveTo(12.552f, 6f, 13f, 6.448f, 13f, 7f)
                verticalLineTo(18.585f)
                lineTo(14.293f, 17.293f)
                curveTo(14.653f, 16.932f, 15.221f, 16.905f, 15.613f, 17.21f)
                lineTo(15.707f, 17.293f)
                curveTo(16.068f, 17.653f, 16.095f, 18.221f, 15.79f, 18.613f)
                lineTo(15.707f, 18.707f)
                lineTo(12.707f, 21.707f)
                curveTo(12.347f, 22.068f, 11.779f, 22.095f, 11.387f, 21.79f)
                lineTo(11.293f, 21.707f)
                lineTo(8.293f, 18.707f)
                curveTo(7.902f, 18.317f, 7.902f, 17.683f, 8.293f, 17.293f)
                curveTo(8.653f, 16.932f, 9.221f, 16.905f, 9.613f, 17.21f)
                lineTo(9.707f, 17.293f)
                lineTo(11f, 18.585f)
                verticalLineTo(7f)
                curveTo(11f, 6.448f, 11.448f, 6f, 12f, 6f)
                close()
                moveTo(12f, 2f)
                curveTo(14.761f, 2f, 17f, 4.239f, 17f, 7f)
                curveTo(17f, 9.05f, 15.766f, 10.812f, 14f, 11.584f)
                lineTo(14.001f, 9.872f)
                curveTo(14.907f, 9.239f, 15.5f, 8.189f, 15.5f, 7f)
                curveTo(15.5f, 5.067f, 13.933f, 3.5f, 12f, 3.5f)
                curveTo(10.067f, 3.5f, 8.5f, 5.067f, 8.5f, 7f)
                curveTo(8.5f, 8.189f, 9.093f, 9.24f, 10f, 9.873f)
                lineTo(10f, 11.584f)
                curveTo(8.234f, 10.813f, 7f, 9.05f, 7f, 7f)
                curveTo(7f, 4.239f, 9.239f, 2f, 12f, 2f)
                close()
            }
        }.build()

        return _SwipeDown!!
    }

@Suppress("ObjectPropertyName")
private var _SwipeDown: ImageVector? = null

@Preview
@Composable
private fun SwipeDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.SwipeDown, contentDescription = null)
    }
}
