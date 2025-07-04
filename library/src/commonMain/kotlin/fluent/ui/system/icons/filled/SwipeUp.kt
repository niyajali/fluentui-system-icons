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

public val FluentIcons.Filled.SwipeUp: ImageVector
    get() {
        if (_SwipeUp != null) {
            return _SwipeUp!!
        }
        _SwipeUp = ImageVector.Builder(
            name = "Filled.SwipeUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 18f)
                curveTo(12.552f, 18f, 13f, 17.552f, 13f, 17f)
                verticalLineTo(5.415f)
                lineTo(14.293f, 6.707f)
                curveTo(14.653f, 7.068f, 15.221f, 7.095f, 15.613f, 6.79f)
                lineTo(15.707f, 6.707f)
                curveTo(16.068f, 6.347f, 16.095f, 5.779f, 15.79f, 5.387f)
                lineTo(15.707f, 5.293f)
                lineTo(12.707f, 2.293f)
                curveTo(12.347f, 1.932f, 11.779f, 1.905f, 11.387f, 2.21f)
                lineTo(11.293f, 2.293f)
                lineTo(8.293f, 5.293f)
                curveTo(7.902f, 5.683f, 7.902f, 6.317f, 8.293f, 6.707f)
                curveTo(8.653f, 7.068f, 9.221f, 7.095f, 9.613f, 6.79f)
                lineTo(9.707f, 6.707f)
                lineTo(11f, 5.415f)
                verticalLineTo(17f)
                curveTo(11f, 17.552f, 11.448f, 18f, 12f, 18f)
                close()
                moveTo(12f, 22f)
                curveTo(14.761f, 22f, 17f, 19.761f, 17f, 17f)
                curveTo(17f, 14.95f, 15.766f, 13.188f, 14f, 12.416f)
                lineTo(14.001f, 14.128f)
                curveTo(14.907f, 14.76f, 15.5f, 15.811f, 15.5f, 17f)
                curveTo(15.5f, 18.933f, 13.933f, 20.5f, 12f, 20.5f)
                curveTo(10.067f, 20.5f, 8.5f, 18.933f, 8.5f, 17f)
                curveTo(8.5f, 15.811f, 9.093f, 14.76f, 10f, 14.127f)
                lineTo(10f, 12.416f)
                curveTo(8.234f, 13.187f, 7f, 14.95f, 7f, 17f)
                curveTo(7f, 19.761f, 9.239f, 22f, 12f, 22f)
                close()
            }
        }.build()

        return _SwipeUp!!
    }

@Suppress("ObjectPropertyName")
private var _SwipeUp: ImageVector? = null

@Preview
@Composable
private fun SwipeUpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.SwipeUp, contentDescription = null)
    }
}
