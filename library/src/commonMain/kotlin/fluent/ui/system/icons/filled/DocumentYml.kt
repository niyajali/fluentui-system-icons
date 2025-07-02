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
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: document, yml
 * - Source: ic_fluent_document_yml_20_filled.svg
 * 
 * @return The [ImageVector] for the DocumentYml icon.
 */
public val FluentIcons.Filled.DocumentYml: ImageVector
    get() {
        if (_documentYml != null) {
            return _documentYml!!
        }
        _documentYml = Builder(name = "DocumentYml", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 6.5f)
                verticalLineTo(2.0f)
                horizontalLineTo(5.5f)
                curveTo(4.672f, 2.0f, 4.0f, 2.672f, 4.0f, 3.5f)
                verticalLineTo(12.045f)
                lineTo(4.252f, 11.667f)
                curveTo(4.712f, 10.978f, 5.643f, 10.792f, 6.332f, 11.251f)
                curveTo(6.392f, 11.291f, 6.448f, 11.335f, 6.5f, 11.381f)
                curveTo(6.682f, 11.218f, 6.905f, 11.099f, 7.156f, 11.04f)
                curveTo(7.833f, 10.88f, 8.531f, 11.206f, 8.842f, 11.828f)
                lineTo(10.0f, 14.145f)
                lineTo(11.159f, 11.828f)
                curveTo(11.47f, 11.206f, 12.168f, 10.88f, 12.845f, 11.04f)
                curveTo(13.095f, 11.099f, 13.318f, 11.219f, 13.5f, 11.381f)
                curveTo(13.766f, 11.144f, 14.116f, 10.999f, 14.5f, 10.999f)
                curveTo(15.318f, 10.999f, 15.983f, 11.654f, 16.0f, 12.468f)
                verticalLineTo(8.0f)
                horizontalLineTo(11.5f)
                curveTo(10.672f, 8.0f, 10.0f, 7.328f, 10.0f, 6.5f)
                close()
                moveTo(11.0f, 6.5f)
                verticalLineTo(2.25f)
                lineTo(15.75f, 7.0f)
                horizontalLineTo(11.5f)
                curveTo(11.224f, 7.0f, 11.0f, 6.776f, 11.0f, 6.5f)
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
        Image(imageVector = FluentIcons.Filled.DocumentYml, contentDescription = null)
    }
}

