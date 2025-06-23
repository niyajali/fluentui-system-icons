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

public val FluentIcons.Filled.Fireplace: ImageVector
    get() {
        if (_Fireplace != null) {
            return _Fireplace!!
        }
        _Fireplace = ImageVector.Builder(
            name = "Filled.Fireplace",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 2f)
                curveTo(7.029f, 2f, 3f, 6.029f, 3f, 11f)
                verticalLineTo(17.25f)
                curveTo(3f, 17.664f, 3.336f, 18f, 3.75f, 18f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 18f, 21f, 17.664f, 21f, 17.25f)
                verticalLineTo(11f)
                curveTo(21f, 6.029f, 16.971f, 2f, 12f, 2f)
                close()
                moveTo(4.5f, 11f)
                curveTo(4.5f, 6.858f, 7.858f, 3.5f, 12f, 3.5f)
                curveTo(16.142f, 3.5f, 19.5f, 6.858f, 19.5f, 11f)
                verticalLineTo(16.5f)
                horizontalLineTo(15.197f)
                curveTo(16.008f, 15.725f, 16.5f, 14.657f, 16.5f, 13.486f)
                curveTo(16.5f, 11.759f, 15.627f, 10.705f, 14.903f, 9.833f)
                lineTo(14.828f, 9.742f)
                curveTo(14.089f, 8.848f, 13.5f, 8.087f, 13.5f, 6.75f)
                curveTo(13.5f, 6.516f, 13.391f, 6.296f, 13.205f, 6.154f)
                curveTo(13.019f, 6.012f, 12.778f, 5.965f, 12.553f, 6.026f)
                curveTo(11.604f, 6.285f, 11.08f, 6.898f, 10.807f, 7.582f)
                curveTo(10.581f, 8.149f, 10.525f, 8.783f, 10.484f, 9.237f)
                curveTo(10.48f, 9.282f, 10.476f, 9.326f, 10.472f, 9.368f)
                curveTo(10.452f, 9.583f, 10.433f, 9.741f, 10.409f, 9.862f)
                curveTo(10.292f, 9.821f, 10.12f, 9.744f, 9.878f, 9.602f)
                curveTo(9.593f, 9.436f, 9.233f, 9.475f, 8.991f, 9.699f)
                lineTo(8.99f, 9.7f)
                lineTo(8.989f, 9.701f)
                lineTo(8.986f, 9.703f)
                lineTo(8.98f, 9.71f)
                lineTo(8.961f, 9.727f)
                curveTo(8.947f, 9.742f, 8.928f, 9.761f, 8.905f, 9.784f)
                curveTo(8.86f, 9.832f, 8.799f, 9.898f, 8.728f, 9.983f)
                curveTo(8.587f, 10.152f, 8.405f, 10.398f, 8.223f, 10.716f)
                curveTo(7.86f, 11.354f, 7.5f, 12.29f, 7.5f, 13.486f)
                curveTo(7.5f, 14.667f, 7.989f, 15.73f, 8.794f, 16.5f)
                horizontalLineTo(4.5f)
                verticalLineTo(11f)
                close()
                moveTo(2.75f, 19.5f)
                curveTo(2.336f, 19.5f, 2f, 19.836f, 2f, 20.25f)
                curveTo(2f, 20.664f, 2.336f, 21f, 2.75f, 21f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 21f, 22f, 20.664f, 22f, 20.25f)
                curveTo(22f, 19.836f, 21.664f, 19.5f, 21.25f, 19.5f)
                horizontalLineTo(2.75f)
                close()
            }
        }.build()

        return _Fireplace!!
    }

@Suppress("ObjectPropertyName")
private var _Fireplace: ImageVector? = null

@Preview
@Composable
private fun FireplacePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Fireplace, contentDescription = null)
    }
}
