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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Filled.TableMoveBelow: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableMoveBelow",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.5f, 9.5f)
            lineTo(9.5f, 13.518f)
            curveTo(9.749f, 13.482f, 10.006f, 13.5f, 10.25f, 13.573f)
            verticalLineTo(12.75f)
            curveTo(10.25f, 11.783f, 11.033f, 11f, 12f, 11f)
            curveTo(12.967f, 11f, 13.75f, 11.783f, 13.75f, 12.75f)
            verticalLineTo(13.573f)
            curveTo(13.994f, 13.5f, 14.251f, 13.482f, 14.5f, 13.518f)
            lineTo(14.5f, 9.5f)
            lineTo(9.5f, 9.5f)
            close()
            moveTo(8f, 9.5f)
            lineTo(8f, 14.5f)
            horizontalLineTo(3.75f)
            curveTo(3.551f, 14.5f, 3.36f, 14.421f, 3.22f, 14.28f)
            curveTo(3.079f, 14.14f, 3f, 13.949f, 3f, 13.75f)
            verticalLineTo(9.5f)
            lineTo(8f, 9.5f)
            close()
            moveTo(9.5f, 8f)
            lineTo(14.5f, 8f)
            lineTo(14.5f, 3f)
            horizontalLineTo(9.5f)
            lineTo(9.5f, 8f)
            close()
            moveTo(16f, 9.5f)
            lineTo(16f, 14.5f)
            lineTo(20.25f, 14.5f)
            curveTo(20.664f, 14.5f, 21f, 14.164f, 21f, 13.75f)
            lineTo(21f, 9.5f)
            lineTo(16f, 9.5f)
            close()
            moveTo(21f, 8f)
            lineTo(16f, 8f)
            lineTo(16f, 3f)
            lineTo(17.75f, 3f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineTo(8f)
            close()
            moveTo(8f, 8f)
            lineTo(3f, 8f)
            verticalLineTo(6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineTo(8f)
            lineTo(8f, 8f)
            close()
            moveTo(3.75f, 19.5f)
            curveTo(3.336f, 19.5f, 3f, 19.836f, 3f, 20.25f)
            curveTo(3f, 20.664f, 3.336f, 21f, 3.75f, 21f)
            lineTo(20.25f, 21f)
            curveTo(20.664f, 21f, 21f, 20.664f, 21f, 20.25f)
            curveTo(21f, 19.836f, 20.664f, 19.5f, 20.25f, 19.5f)
            lineTo(3.75f, 19.5f)
            close()
            moveTo(9.189f, 14.752f)
            curveTo(9.465f, 14.442f, 9.939f, 14.414f, 10.248f, 14.689f)
            lineTo(11.25f, 15.58f)
            verticalLineTo(12.75f)
            curveTo(11.25f, 12.336f, 11.586f, 12f, 12f, 12f)
            curveTo(12.414f, 12f, 12.75f, 12.336f, 12.75f, 12.75f)
            verticalLineTo(15.58f)
            lineTo(13.752f, 14.689f)
            curveTo(14.061f, 14.414f, 14.535f, 14.442f, 14.811f, 14.752f)
            curveTo(15.086f, 15.061f, 15.058f, 15.535f, 14.748f, 15.811f)
            lineTo(12.498f, 17.811f)
            curveTo(12.214f, 18.063f, 11.786f, 18.063f, 11.502f, 17.811f)
            lineTo(9.252f, 15.811f)
            curveTo(8.942f, 15.535f, 8.914f, 15.061f, 9.189f, 14.752f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TableMoveBelowPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TableMoveBelow, contentDescription = null)
    }
}
