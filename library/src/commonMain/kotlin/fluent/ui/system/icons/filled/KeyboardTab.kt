/**
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

public val FluentUi.Filled.KeyboardTab: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.KeyboardTab",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(18.207f, 11.293f)
            lineTo(11.707f, 4.793f)
            curveTo(11.317f, 4.402f, 10.683f, 4.402f, 10.293f, 4.793f)
            curveTo(9.932f, 5.153f, 9.905f, 5.721f, 10.21f, 6.113f)
            lineTo(10.293f, 6.207f)
            lineTo(15.086f, 11f)
            horizontalLineTo(4f)
            curveTo(3.487f, 11f, 3.064f, 11.386f, 3.007f, 11.883f)
            lineTo(3f, 12f)
            curveTo(3f, 12.513f, 3.386f, 12.936f, 3.883f, 12.993f)
            lineTo(4f, 13f)
            horizontalLineTo(15.086f)
            lineTo(10.293f, 17.793f)
            curveTo(9.932f, 18.153f, 9.905f, 18.721f, 10.21f, 19.113f)
            lineTo(10.293f, 19.207f)
            curveTo(10.653f, 19.568f, 11.221f, 19.595f, 11.613f, 19.29f)
            lineTo(11.707f, 19.207f)
            lineTo(18.207f, 12.707f)
            curveTo(18.568f, 12.347f, 18.595f, 11.779f, 18.29f, 11.387f)
            lineTo(18.207f, 11.293f)
            lineTo(11.707f, 4.793f)
            lineTo(18.207f, 11.293f)
            close()
            moveTo(21f, 18.5f)
            verticalLineTo(5.5f)
            curveTo(21f, 4.948f, 20.552f, 4.5f, 20f, 4.5f)
            curveTo(19.448f, 4.5f, 19f, 4.948f, 19f, 5.5f)
            verticalLineTo(18.5f)
            curveTo(19f, 19.052f, 19.448f, 19.5f, 20f, 19.5f)
            curveTo(20.552f, 19.5f, 21f, 19.052f, 21f, 18.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun KeyboardTabPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.KeyboardTab, contentDescription = null)
    }
}
