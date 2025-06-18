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

public val FluentUi.Filled.TableMoveLeft: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableMoveLeft",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16f, 21f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 21f, 21f, 19.545f, 21f, 17.75f)
            verticalLineTo(16f)
            horizontalLineTo(16f)
            verticalLineTo(21f)
            close()
            moveTo(16f, 14.5f)
            horizontalLineTo(21f)
            lineTo(21f, 9.5f)
            horizontalLineTo(16f)
            verticalLineTo(14.5f)
            close()
            moveTo(10.482f, 9.5f)
            horizontalLineTo(14.5f)
            verticalLineTo(14.5f)
            horizontalLineTo(10.482f)
            curveTo(10.518f, 14.251f, 10.5f, 13.994f, 10.427f, 13.75f)
            horizontalLineTo(11.25f)
            curveTo(12.217f, 13.75f, 13f, 12.967f, 13f, 12f)
            curveTo(13f, 11.033f, 12.217f, 10.25f, 11.25f, 10.25f)
            horizontalLineTo(10.427f)
            curveTo(10.5f, 10.006f, 10.518f, 9.749f, 10.482f, 9.5f)
            close()
            moveTo(16f, 8f)
            horizontalLineTo(21f)
            lineTo(21f, 6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(16f)
            verticalLineTo(8f)
            close()
            moveTo(14.5f, 3f)
            verticalLineTo(8f)
            horizontalLineTo(9.5f)
            verticalLineTo(3.75f)
            curveTo(9.5f, 3.551f, 9.579f, 3.36f, 9.72f, 3.22f)
            curveTo(9.86f, 3.079f, 10.051f, 3f, 10.25f, 3f)
            horizontalLineTo(14.5f)
            close()
            moveTo(14.5f, 16f)
            verticalLineTo(21f)
            horizontalLineTo(10.25f)
            curveTo(9.836f, 21f, 9.5f, 20.664f, 9.5f, 20.25f)
            lineTo(9.5f, 16f)
            horizontalLineTo(14.5f)
            close()
            moveTo(4.5f, 3.75f)
            curveTo(4.5f, 3.336f, 4.164f, 3f, 3.75f, 3f)
            curveTo(3.336f, 3f, 3f, 3.336f, 3f, 3.75f)
            verticalLineTo(20.25f)
            curveTo(3f, 20.664f, 3.336f, 21f, 3.75f, 21f)
            curveTo(4.164f, 21f, 4.5f, 20.664f, 4.5f, 20.25f)
            lineTo(4.5f, 3.75f)
            close()
            moveTo(9.248f, 9.189f)
            curveTo(9.558f, 9.465f, 9.586f, 9.939f, 9.311f, 10.248f)
            lineTo(8.42f, 11.25f)
            horizontalLineTo(11.25f)
            curveTo(11.664f, 11.25f, 12f, 11.586f, 12f, 12f)
            curveTo(12f, 12.414f, 11.664f, 12.75f, 11.25f, 12.75f)
            horizontalLineTo(8.42f)
            lineTo(9.311f, 13.752f)
            curveTo(9.586f, 14.061f, 9.558f, 14.535f, 9.248f, 14.811f)
            curveTo(8.939f, 15.086f, 8.465f, 15.058f, 8.189f, 14.748f)
            lineTo(6.189f, 12.498f)
            curveTo(5.937f, 12.214f, 5.937f, 11.786f, 6.189f, 11.502f)
            lineTo(8.189f, 9.252f)
            curveTo(8.465f, 8.942f, 8.939f, 8.914f, 9.248f, 9.189f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TableMoveLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TableMoveLeft, contentDescription = null)
    }
}
