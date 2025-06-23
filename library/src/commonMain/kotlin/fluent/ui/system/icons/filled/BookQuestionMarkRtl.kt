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

public val FluentIcons.Filled.BookQuestionMarkRtl: ImageVector
    get() {
        if (_BookQuestionMarkRtl != null) {
            return _BookQuestionMarkRtl!!
        }
        _BookQuestionMarkRtl = ImageVector.Builder(
            name = "Filled.BookQuestionMarkRtl",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4f, 4.5f)
                verticalLineTo(19.5f)
                curveTo(4f, 20.881f, 5.119f, 22f, 6.5f, 22f)
                horizontalLineTo(19.75f)
                curveTo(20.164f, 22f, 20.5f, 21.664f, 20.5f, 21.25f)
                curveTo(20.5f, 20.836f, 20.164f, 20.5f, 19.75f, 20.5f)
                horizontalLineTo(6.5f)
                curveTo(5.948f, 20.5f, 5.5f, 20.052f, 5.5f, 19.5f)
                horizontalLineTo(19.75f)
                curveTo(20.164f, 19.5f, 20.5f, 19.164f, 20.5f, 18.75f)
                verticalLineTo(4.5f)
                curveTo(20.5f, 3.119f, 19.381f, 2f, 18f, 2f)
                horizontalLineTo(6.5f)
                curveTo(5.119f, 2f, 4f, 3.119f, 4f, 4.5f)
                close()
                moveTo(14.5f, 8.75f)
                curveTo(14.092f, 8.75f, 13.759f, 8.423f, 13.75f, 8.017f)
                lineTo(13.75f, 8.012f)
                curveTo(13.748f, 7.999f, 13.745f, 7.973f, 13.736f, 7.938f)
                curveTo(13.719f, 7.868f, 13.684f, 7.774f, 13.616f, 7.681f)
                curveTo(13.507f, 7.535f, 13.198f, 7.233f, 12.263f, 7.25f)
                curveTo(11.713f, 7.259f, 11.306f, 7.486f, 11.084f, 7.761f)
                curveTo(10.871f, 8.026f, 10.802f, 8.36f, 10.946f, 8.721f)
                curveTo(11.063f, 9.013f, 11.321f, 9.161f, 11.863f, 9.4f)
                lineTo(11.901f, 9.417f)
                curveTo(12.122f, 9.515f, 12.437f, 9.653f, 12.687f, 9.853f)
                curveTo(12.998f, 10.103f, 13.25f, 10.477f, 13.25f, 11f)
                lineTo(13.25f, 11.75f)
                curveTo(13.25f, 12.164f, 12.914f, 12.5f, 12.5f, 12.5f)
                curveTo(12.086f, 12.5f, 11.75f, 12.163f, 11.75f, 11.749f)
                lineTo(11.75f, 11.025f)
                lineTo(11.749f, 11.024f)
                curveTo(11.669f, 10.96f, 11.535f, 10.896f, 11.257f, 10.773f)
                lineTo(11.206f, 10.75f)
                curveTo(10.735f, 10.543f, 9.916f, 10.184f, 9.554f, 9.278f)
                curveTo(9.198f, 8.39f, 9.379f, 7.487f, 9.916f, 6.82f)
                curveTo(10.444f, 6.165f, 11.287f, 5.766f, 12.237f, 5.75f)
                curveTo(13.552f, 5.727f, 14.368f, 6.176f, 14.821f, 6.789f)
                curveTo(15.034f, 7.076f, 15.14f, 7.365f, 15.193f, 7.582f)
                curveTo(15.22f, 7.691f, 15.234f, 7.785f, 15.241f, 7.856f)
                curveTo(15.245f, 7.891f, 15.247f, 7.922f, 15.249f, 7.946f)
                curveTo(15.249f, 7.961f, 15.25f, 7.975f, 15.25f, 7.99f)
                lineTo(15.25f, 7.995f)
                lineTo(15.25f, 7.998f)
                lineTo(15.25f, 7.999f)
                curveTo(15.25f, 7.999f, 15.25f, 8.75f, 14.5f, 8.75f)
                close()
                moveTo(11.5f, 14.5f)
                curveTo(11.5f, 13.948f, 11.948f, 13.5f, 12.5f, 13.5f)
                curveTo(13.052f, 13.5f, 13.5f, 13.948f, 13.5f, 14.5f)
                curveTo(13.5f, 15.052f, 13.052f, 15.5f, 12.5f, 15.5f)
                curveTo(11.948f, 15.5f, 11.5f, 15.052f, 11.5f, 14.5f)
                close()
            }
        }.build()

        return _BookQuestionMarkRtl!!
    }

@Suppress("ObjectPropertyName")
private var _BookQuestionMarkRtl: ImageVector? = null

@Preview
@Composable
private fun BookQuestionMarkRtlPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.BookQuestionMarkRtl, contentDescription = null)
    }
}
