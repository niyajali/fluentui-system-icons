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
 * DocumentYml icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: document, yml
 * - Source: ic_fluent_document_yml_20_regular.svg
 * 
 * @return The [ImageVector] for the DocumentYml icon.
 */
public val FluentIcons.Regular.DocumentYml: ImageVector
    get() {
        if (_documentYml != null) {
            return _documentYml!!
        }
        _documentYml = Builder(name = "DocumentYml", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 4.0f)
                curveTo(4.0f, 2.895f, 4.895f, 2.0f, 6.0f, 2.0f)
                horizontalLineTo(10.586f)
                curveTo(10.984f, 2.0f, 11.365f, 2.158f, 11.646f, 2.439f)
                lineTo(15.561f, 6.354f)
                curveTo(15.842f, 6.635f, 16.0f, 7.016f, 16.0f, 7.414f)
                verticalLineTo(12.487f)
                curveTo(15.995f, 11.839f, 15.579f, 11.289f, 15.0f, 11.085f)
                verticalLineTo(8.0f)
                horizontalLineTo(11.5f)
                curveTo(10.672f, 8.0f, 10.0f, 7.328f, 10.0f, 6.5f)
                verticalLineTo(3.0f)
                horizontalLineTo(6.0f)
                curveTo(5.448f, 3.0f, 5.0f, 3.448f, 5.0f, 4.0f)
                verticalLineTo(11.085f)
                curveTo(4.704f, 11.189f, 4.439f, 11.387f, 4.252f, 11.667f)
                lineTo(4.0f, 12.045f)
                verticalLineTo(4.0f)
                close()
                moveTo(11.5f, 7.0f)
                horizontalLineTo(14.793f)
                lineTo(11.0f, 3.207f)
                verticalLineTo(6.5f)
                curveTo(11.0f, 6.776f, 11.224f, 7.0f, 11.5f, 7.0f)
                close()
                moveTo(3.5f, 18.0f)
                curveTo(3.776f, 18.0f, 4.0f, 17.776f, 4.0f, 17.5f)
                verticalLineTo(15.651f)
                lineTo(5.916f, 12.777f)
                curveTo(6.069f, 12.547f, 6.007f, 12.237f, 5.777f, 12.083f)
                curveTo(5.548f, 11.93f, 5.237f, 11.993f, 5.084f, 12.222f)
                lineTo(3.5f, 14.599f)
                lineTo(1.916f, 12.222f)
                curveTo(1.763f, 11.993f, 1.453f, 11.93f, 1.223f, 12.083f)
                curveTo(0.993f, 12.237f, 0.931f, 12.547f, 1.084f, 12.777f)
                lineTo(3.0f, 15.651f)
                verticalLineTo(17.5f)
                curveTo(3.0f, 17.776f, 3.224f, 18.0f, 3.5f, 18.0f)
                close()
                moveTo(7.947f, 12.276f)
                curveTo(7.844f, 12.069f, 7.611f, 11.96f, 7.385f, 12.013f)
                curveTo(7.16f, 12.066f, 7.0f, 12.268f, 7.0f, 12.5f)
                verticalLineTo(17.5f)
                curveTo(7.0f, 17.776f, 7.224f, 18.0f, 7.5f, 18.0f)
                curveTo(7.776f, 18.0f, 8.0f, 17.776f, 8.0f, 17.5f)
                verticalLineTo(14.618f)
                lineTo(9.553f, 17.723f)
                curveTo(9.638f, 17.893f, 9.811f, 18.0f, 10.0f, 18.0f)
                curveTo(10.189f, 18.0f, 10.363f, 17.893f, 10.447f, 17.723f)
                lineTo(12.0f, 14.618f)
                verticalLineTo(17.5f)
                curveTo(12.0f, 17.776f, 12.224f, 18.0f, 12.5f, 18.0f)
                curveTo(12.776f, 18.0f, 13.0f, 17.776f, 13.0f, 17.5f)
                verticalLineTo(12.5f)
                curveTo(13.0f, 12.268f, 12.841f, 12.066f, 12.615f, 12.013f)
                curveTo(12.389f, 11.96f, 12.157f, 12.069f, 12.053f, 12.276f)
                lineTo(10.0f, 16.382f)
                lineTo(7.947f, 12.276f)
                close()
                moveTo(15.0f, 12.5f)
                curveTo(15.0f, 12.224f, 14.776f, 12.0f, 14.5f, 12.0f)
                curveTo(14.224f, 12.0f, 14.0f, 12.224f, 14.0f, 12.5f)
                verticalLineTo(17.5f)
                curveTo(14.0f, 17.776f, 14.224f, 18.0f, 14.5f, 18.0f)
                horizontalLineTo(17.5f)
                curveTo(17.776f, 18.0f, 18.0f, 17.776f, 18.0f, 17.5f)
                curveTo(18.0f, 17.223f, 17.776f, 17.0f, 17.5f, 17.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(12.5f)
                close()
            }
        }
        .build()
        return _documentYml!!
    }

@Suppress("ObjectPropertyName")
private var _documentYml: ImageVector? = null

@Preview
@Composable
private fun DocumentYmlPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DocumentYml, contentDescription = null)
    }
}

