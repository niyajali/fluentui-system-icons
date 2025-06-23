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

public val FluentIcons.Filled.DoubleTapSwipeUp: ImageVector
    get() {
        if (_DoubleTapSwipeUp != null) {
            return _DoubleTapSwipeUp!!
        }
        _DoubleTapSwipeUp = ImageVector.Builder(
            name = "Filled.DoubleTapSwipeUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12.707f, 2.293f)
                curveTo(12.317f, 1.902f, 11.683f, 1.902f, 11.293f, 2.293f)
                lineTo(8.293f, 5.293f)
                curveTo(7.902f, 5.683f, 7.902f, 6.317f, 8.293f, 6.707f)
                curveTo(8.683f, 7.098f, 9.317f, 7.098f, 9.707f, 6.707f)
                lineTo(11f, 5.414f)
                verticalLineTo(15f)
                curveTo(11f, 15.552f, 11.448f, 16f, 12f, 16f)
                curveTo(12.552f, 16f, 13f, 15.552f, 13f, 15f)
                verticalLineTo(5.414f)
                lineTo(14.293f, 6.707f)
                curveTo(14.683f, 7.098f, 15.317f, 7.098f, 15.707f, 6.707f)
                curveTo(16.098f, 6.317f, 16.098f, 5.683f, 15.707f, 5.293f)
                lineTo(12.707f, 2.293f)
                close()
                moveTo(4.5f, 15f)
                curveTo(4.5f, 11.55f, 6.829f, 8.645f, 10f, 7.77f)
                verticalLineTo(9.875f)
                curveTo(7.951f, 10.675f, 6.5f, 12.668f, 6.5f, 15f)
                curveTo(6.5f, 18.038f, 8.962f, 20.5f, 12f, 20.5f)
                curveTo(15.038f, 20.5f, 17.5f, 18.038f, 17.5f, 15f)
                curveTo(17.5f, 12.668f, 16.049f, 10.675f, 14f, 9.875f)
                verticalLineTo(7.77f)
                curveTo(17.171f, 8.645f, 19.5f, 11.55f, 19.5f, 15f)
                curveTo(19.5f, 19.142f, 16.142f, 22.5f, 12f, 22.5f)
                curveTo(7.858f, 22.5f, 4.5f, 19.142f, 4.5f, 15f)
                close()
                moveTo(7.5f, 15f)
                curveTo(7.5f, 13.233f, 8.518f, 11.704f, 10f, 10.968f)
                verticalLineTo(13.5f)
                curveTo(9.686f, 13.917f, 9.5f, 14.437f, 9.5f, 15f)
                curveTo(9.5f, 16.381f, 10.619f, 17.5f, 12f, 17.5f)
                curveTo(13.381f, 17.5f, 14.5f, 16.381f, 14.5f, 15f)
                curveTo(14.5f, 14.437f, 14.314f, 13.917f, 14f, 13.5f)
                verticalLineTo(10.968f)
                curveTo(15.482f, 11.704f, 16.5f, 13.233f, 16.5f, 15f)
                curveTo(16.5f, 17.485f, 14.485f, 19.5f, 12f, 19.5f)
                curveTo(9.515f, 19.5f, 7.5f, 17.485f, 7.5f, 15f)
                close()
            }
        }.build()

        return _DoubleTapSwipeUp!!
    }

@Suppress("ObjectPropertyName")
private var _DoubleTapSwipeUp: ImageVector? = null

@Preview
@Composable
private fun DoubleTapSwipeUpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DoubleTapSwipeUp, contentDescription = null)
    }
}
