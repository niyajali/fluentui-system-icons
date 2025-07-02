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
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * PersonRunning icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: person, running
 * - Source: ic_fluent_person_running_20_regular.svg
 * 
 * @return The [ImageVector] for the PersonRunning icon.
 */
public val FluentIcons.Regular.PersonRunning: ImageVector
    get() {
        if (_personRunning != null) {
            return _personRunning!!
        }
        _personRunning = Builder(name = "PersonRunning", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.5f, 6.0f)
                curveTo(12.672f, 6.0f, 12.0f, 5.328f, 12.0f, 4.5f)
                curveTo(12.0f, 3.672f, 12.672f, 3.0f, 13.5f, 3.0f)
                curveTo(14.328f, 3.0f, 15.0f, 3.672f, 15.0f, 4.5f)
                curveTo(15.0f, 5.328f, 14.328f, 6.0f, 13.5f, 6.0f)
                close()
                moveTo(14.826f, 6.619f)
                curveTo(15.531f, 6.177f, 16.0f, 5.393f, 16.0f, 4.5f)
                curveTo(16.0f, 3.119f, 14.881f, 2.0f, 13.5f, 2.0f)
                curveTo(12.119f, 2.0f, 11.0f, 3.119f, 11.0f, 4.5f)
                horizontalLineTo(8.0f)
                curveTo(6.619f, 4.5f, 5.5f, 5.619f, 5.5f, 7.0f)
                verticalLineTo(8.75f)
                curveTo(5.5f, 9.438f, 5.897f, 10.033f, 6.474f, 10.319f)
                lineTo(5.793f, 11.0f)
                horizontalLineTo(2.75f)
                curveTo(1.783f, 11.0f, 1.0f, 11.783f, 1.0f, 12.75f)
                curveTo(1.0f, 13.717f, 1.783f, 14.5f, 2.75f, 14.5f)
                horizontalLineTo(5.686f)
                curveTo(6.323f, 14.5f, 6.942f, 14.293f, 7.451f, 13.912f)
                lineTo(8.453f, 13.16f)
                lineTo(10.0f, 14.707f)
                verticalLineTo(16.25f)
                curveTo(10.0f, 17.216f, 10.783f, 18.0f, 11.75f, 18.0f)
                curveTo(12.717f, 18.0f, 13.5f, 17.216f, 13.5f, 16.25f)
                verticalLineTo(13.0f)
                curveTo(13.5f, 12.867f, 13.447f, 12.74f, 13.354f, 12.646f)
                lineTo(11.707f, 11.0f)
                lineTo(12.5f, 10.207f)
                lineTo(12.597f, 10.304f)
                curveTo(13.042f, 10.75f, 13.647f, 11.0f, 14.277f, 11.0f)
                horizontalLineTo(17.25f)
                curveTo(18.216f, 11.0f, 19.0f, 10.217f, 19.0f, 9.25f)
                curveTo(19.0f, 8.283f, 18.216f, 7.5f, 17.25f, 7.5f)
                horizontalLineTo(15.707f)
                lineTo(14.826f, 6.619f)
                close()
                moveTo(13.778f, 6.985f)
                lineTo(15.146f, 8.354f)
                curveTo(15.24f, 8.447f, 15.367f, 8.5f, 15.5f, 8.5f)
                horizontalLineTo(17.25f)
                curveTo(17.664f, 8.5f, 18.0f, 8.836f, 18.0f, 9.25f)
                curveTo(18.0f, 9.664f, 17.664f, 10.0f, 17.25f, 10.0f)
                horizontalLineTo(14.277f)
                curveTo(13.912f, 10.0f, 13.562f, 9.855f, 13.304f, 9.597f)
                lineTo(12.854f, 9.146f)
                curveTo(12.658f, 8.951f, 12.342f, 8.951f, 12.146f, 9.146f)
                lineTo(10.646f, 10.646f)
                curveTo(10.451f, 10.842f, 10.451f, 11.158f, 10.646f, 11.354f)
                lineTo(12.5f, 13.207f)
                verticalLineTo(16.25f)
                curveTo(12.5f, 16.664f, 12.164f, 17.0f, 11.75f, 17.0f)
                curveTo(11.336f, 17.0f, 11.0f, 16.664f, 11.0f, 16.25f)
                verticalLineTo(14.5f)
                curveTo(11.0f, 14.367f, 10.947f, 14.24f, 10.854f, 14.146f)
                lineTo(8.854f, 12.146f)
                curveTo(8.678f, 11.97f, 8.399f, 11.951f, 8.2f, 12.1f)
                lineTo(6.851f, 13.112f)
                curveTo(6.515f, 13.364f, 6.106f, 13.5f, 5.686f, 13.5f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 13.5f, 2.0f, 13.164f, 2.0f, 12.75f)
                curveTo(2.0f, 12.336f, 2.336f, 12.0f, 2.75f, 12.0f)
                horizontalLineTo(6.0f)
                curveTo(6.133f, 12.0f, 6.26f, 11.947f, 6.354f, 11.854f)
                lineTo(7.793f, 10.414f)
                curveTo(8.494f, 10.186f, 9.0f, 9.527f, 9.0f, 8.75f)
                verticalLineTo(8.0f)
                horizontalLineTo(10.0f)
                curveTo(10.276f, 8.0f, 10.5f, 7.776f, 10.5f, 7.5f)
                curveTo(10.5f, 7.224f, 10.276f, 7.0f, 10.0f, 7.0f)
                horizontalLineTo(8.5f)
                curveTo(8.224f, 7.0f, 8.0f, 7.224f, 8.0f, 7.5f)
                verticalLineTo(8.75f)
                curveTo(8.0f, 9.164f, 7.664f, 9.5f, 7.25f, 9.5f)
                curveTo(6.836f, 9.5f, 6.5f, 9.164f, 6.5f, 8.75f)
                verticalLineTo(7.0f)
                curveTo(6.5f, 6.172f, 7.172f, 5.5f, 8.0f, 5.5f)
                horizontalLineTo(11.208f)
                curveTo(11.594f, 6.383f, 12.475f, 7.0f, 13.5f, 7.0f)
                curveTo(13.594f, 7.0f, 13.686f, 6.995f, 13.778f, 6.985f)
                close()
            }
        }
        .build()
        return _personRunning!!
    }

@Suppress("ObjectPropertyName")
private var _personRunning: ImageVector? = null

@Preview
@Composable
private fun PersonRunningPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PersonRunning, contentDescription = null)
    }
}

